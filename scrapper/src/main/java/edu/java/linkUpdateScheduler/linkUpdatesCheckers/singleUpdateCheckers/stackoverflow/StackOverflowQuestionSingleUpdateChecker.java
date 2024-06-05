package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.stackoverflow;

import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.data.dto.StackOverflowQuestion;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.SingleUpdateChecker;

public interface StackOverflowQuestionSingleUpdateChecker
    extends SingleUpdateChecker<StackOverflowQuestion, StackOverflowQuestionBody> {
}
