package edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.configuration.ApplicationConfig;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.exceptions.NoSuchStackOverflowQuestionException;
import edu.java.data.dto.Link;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.exceptions.UnsuccessfulStackOverflowQuestionUrlParseException;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow.StackOverflowQuestionSingleUpdateChecker;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StackOverflowAllUpdatesChecker implements LinkAllUpdatesChecker {

    private static final Pattern QUESTION_ID_EXCTRACTOR_PATTERN = Pattern.compile("questions/(\\d+)/");

    private final LinkDataAccessObject linkDao;
    private final StackOverflowQuestionDataAccessObject stackOverflowQuestionDao;
    private final StackOverflowClientInBeanConfiguration stackOverflowClient;
    private final List<StackOverflowQuestionSingleUpdateChecker> updateCheckers;
    private final ApplicationConfig applicationConfig;

    @Override
    public List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        long questionId = extractQuestionId(link.getUrl());
        StackOverflowQuestionBody currentQuestionBody =
            stackOverflowClient.findQuestionById((int)questionId).getBody().items().getFirst();
        StackOverflowQuestion oldQuestionRecord = stackOverflowQuestionDao.findById(questionId)
            .orElseThrow(
                () -> new NoSuchStackOverflowQuestionException(STR."There is no question with id \{questionId}")
            );

        List<LinkUpdateType> detectedUpdatesTypes =
            iterateAllSingleUpdateCheckers(oldQuestionRecord, currentQuestionBody);

        if (!detectedUpdatesTypes.isEmpty()) {
            updateLocalRecord(currentQuestionBody, link.getId());
        }

        return buildLinkUpdateList(link, detectedUpdatesTypes);
    }

    private List<LinkUpdate> buildLinkUpdateList(Link link, List<LinkUpdateType> updateTypes) {
        List<Long> chatIds = linkDao.findAssociatedChatsIdsById(link.getId());
        return updateTypes.stream()
            .map(type ->
                new LinkUpdate(
                    link.getId(),
                    link.getUrl(),
                    type,
                    chatIds
                )
            )
            .toList();
    }

    private boolean isIncorrectHostName(String hostName) {
        return !hostName.equals("stackoverflow.com");
    }

    private int extractQuestionId(URI url) {
        Matcher matcher = QUESTION_ID_EXCTRACTOR_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new UnsuccessfulStackOverflowQuestionUrlParseException(url);
        }
    }

    private List<LinkUpdateType> iterateAllSingleUpdateCheckers(
        StackOverflowQuestion oldQuestionRecord,
        StackOverflowQuestionBody currentQuestionBody
    ) {
        List<LinkUpdateType> linkUpdateTypes = new ArrayList<>();
        for (var updateChecker : updateCheckers) {
            if (updateChecker.hasUpdate(oldQuestionRecord, currentQuestionBody)) {
                linkUpdateTypes.add(updateChecker.getType());
            }
        }
        return linkUpdateTypes;
    }

    private void updateLocalRecord(StackOverflowQuestionBody newQuestionBody, long linkId) {
        int id = newQuestionBody.id();
        OffsetDateTime offsetDateTime = newQuestionBody.lastActivityDate();
        Set<Long> answersIds =
            stackOverflowClient
                .findAnswersByQuestionId(id)
                .getBody()
                .items().stream()
                .map(StackOverflowAnswer::id)
                .collect(Collectors.toSet());

        StackOverflowQuestion updatedQuestion = new StackOverflowQuestion(
            id,
            linkId,
            offsetDateTime,
            answersIds
        );
        stackOverflowQuestionDao.update(updatedQuestion);
    }
}
