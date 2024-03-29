package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.postgres.entities.StackOverflowQuestion;
import java.time.OffsetDateTime;
import org.springframework.stereotype.Component;

@Component
public class StackOverflowQuestionDescriptionUpdateChecker implements StackOverflowQuestionSingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.STACK_OVERFLOW_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(StackOverflowQuestion oldState, StackOverflowQuestionBody newState) {
        OffsetDateTime oldtime = oldState.getLastActivityDate();
        OffsetDateTime newTime = newState.lastActivityDate();
        return !oldtime.isEqual(newTime);
    }
}
