package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.dto.StackOverflowQuestion;
import java.time.OffsetDateTime;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowQuestionDescriptionUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {
    private final int hours = 3;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        OffsetDateTime oldtime = oldState.getLastActivityDate();
        OffsetDateTime newTime = newState.lastActivityDate().plusHours(hours);
        return !oldtime.isEqual(newTime);
    }
}
