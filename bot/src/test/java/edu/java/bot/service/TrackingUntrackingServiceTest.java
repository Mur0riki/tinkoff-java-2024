package edu.java.bot.service;

import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import edu.java.bot.BotApplication;
import edu.java.bot.commands.CommandStart;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {BotApplication.class})
class TrackingUntrackingServiceTest {
    @Autowired MessageService messageService;
    @MockBean Update update;

    private static Stream<Arguments> registerUserCommands() {
        return Stream.of(
            Arguments.of(18L, "/start", CommandStart.SUCCESS_REGISTRATION_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.INVALID_COMMAND_MESSAGE),
            Arguments.of(18L, "/track", CommandService.TRACK_MESSAGE),
            Arguments.of(18L, "NotURL", TrackingUntrackingService.INVALID_FOR_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", TrackingUntrackingService.SUCCESS_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "/track", CommandService.TRACK_MESSAGE),
            Arguments.of(18L, "https://iprody.com/#close", TrackingUntrackingService.INVALID_FOR_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "/track", CommandService.TRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", TrackingUntrackingService.DUPLICATE_TRACKING_MESSAGE),
            Arguments.of(18L, "/untrack", CommandService.UNTRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", TrackingUntrackingService.SUCCESS_UNTRACKED_SITE_MESSAGE),
            Arguments.of(18L, "/untrack", CommandService.UNTRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", TrackingUntrackingService.DUPLICATE_UNTRACKING_MESSAGE),
            Arguments.of(18L, "NotURL", TrackingUntrackingService.INVALID_FOR_TRACK_SITE_MESSAGE)
        );
    }

    @ParameterizedTest
    @MethodSource("registerUserCommands")
    @DisplayName("Test that messages from an Registered user are handled correctly and returned the correct response")
    void testThatMessagesFromAnRegisteredUserAreHandledCorrectlyAndReturnedTheCorrectResponse(
        long id,
        String text,
        String exceptedResponse
    ) {
        setUpMockUpdate(id, text);

        var actualResponseService = messageService.prepareResponseMessage(update);
        assertThat(actualResponseService).isEqualTo(exceptedResponse);
    }

    private void setUpMockUpdate(long id, String text) {
        Message messageMock = mock(Message.class);
        Chat chatMock = mock(Chat.class);

        when(update.message()).thenReturn(messageMock);
        when(messageMock.chat()).thenReturn(chatMock);

        when(chatMock.id()).thenReturn(id);
        when(update.message().chat().id()).thenReturn(id);

        when(messageMock.text()).thenReturn(text);
        when(update.message().text()).thenReturn(text);
    }

}
