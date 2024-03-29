package edu.java.data.dao.initialStateScreeners;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.configuration.ApplicationConfig;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.exceptions.UnsuccessfulStackOverflowQuestionUrlParseException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;

@Component
@RequiredArgsConstructor
public class StackOverflowInitialStateScreener implements InitialStateScreener {

    private static final Pattern QUESTION_ID_EXCTRACTOR_PATTERN = Pattern.compile("questions/(\\d+)/");

    private final ApplicationConfig applicationConfig;
    private final StackOverflowClientInBeanConfiguration stackOverflowClient;
    private final StackOverflowQuestionDataAccessObject stackOverflowQuestionDao;

    @Override
    public void saveInitialState(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (!hostName.equals("stackoverflow.com")) {
            throw new IncorrectHostException(hostName);
        }

        int questionId = extractQuestionId(link.getUrl());
        StackOverflowQuestionBody questionBody = stackOverflowClient.findQuestionById(questionId).getBody().items().getFirst();


        var question = buildQuestionEntity(questionBody, link.getId());

        stackOverflowQuestionDao.save(question);
    }

    private StackOverflowQuestion buildQuestionEntity(StackOverflowQuestionBody questionBody, long linkId) {
        int id = questionBody.id();
        OffsetDateTime last_activity_date = questionBody.lastActivityDate();
        Set<Long> answers = stackOverflowClient
            .findAnswersByQuestionId(id)
            .getBody()
            .items()
            .stream()
            .map(StackOverflowAnswer::id)
            .collect(Collectors.toSet());

        return new StackOverflowQuestion(
            id,
            linkId,
            last_activity_date,
            answers
        );
    }

    private int extractQuestionId(URI url) {
        Matcher matcher = QUESTION_ID_EXCTRACTOR_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new UnsuccessfulStackOverflowQuestionUrlParseException(url);
        }
    }
}
