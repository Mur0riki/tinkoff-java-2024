package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.dto.StackOverflowQuestion;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StackOverflowQuestionAnswersUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {

    private final StackOverflowClientInBeanConfiguration stackOverflowClient;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_ANSWERS;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        Set<Long> oldAnswers = oldState.getAnswerIds();
        Set<Long> newAnswers = fetchAnswersIds(newState.id());

        return !oldAnswers.equals(newAnswers);
    }

    private Set<Long> fetchAnswersIds(long questionId) {
        return stackOverflowClient
            .findAnswersByQuestionId((int) questionId)
            .getBody()
            .items()
            .stream()
            .map(StackOverflowAnswer::id)
            .collect(Collectors.toSet());
    }

}
