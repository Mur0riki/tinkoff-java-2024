package edu.java.bot.service;

import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import edu.java.bot.BotApplication;
import edu.java.bot.commands.CommandList;
import edu.java.bot.commands.CommandStart;
import edu.java.bot.commands.CommandTrack;
import edu.java.bot.commands.CommandUntrack;
import edu.java.bot.repository.UserService;
import java.util.stream.Stream;
import org.junit.BeforeClass;
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
class MessageServiceTest {
    @MockBean Update update;

    @Autowired MessageService messageService;

    @Autowired UserService userService;

    @BeforeClass
    public void clearDataBase() {
        userService.clearDB();
    }

    private static Stream<Arguments> unregisterUserCommands() {
        return Stream.of(
            Arguments.of(1L, "привет", MessageService.DO_REGISTRATION_MESSAGE),
            Arguments.of(2L, "/list", CommandList.UNKNOWN_USER),
            Arguments.of(3L, "/track", CommandTrack.UNKNOWN_USER),
            Arguments.of(4L, "/untrack", CommandUntrack.UNKNOWN_USER),
            Arguments.of(5L, "other message", MessageService.DO_REGISTRATION_MESSAGE)
        );
    }

    private static Stream<Arguments> registerUserCommands() {
        return Stream.of(
            Arguments.of(18L, "/start", CommandStart.SUCCESS_REGISTRATION_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.INVALID_COMMAND_MESSAGE),
            Arguments.of(18L, "/track", CommandTrack.TRACK_MESSAGE),
            Arguments.of(18L, "NotURL", MessageService.INVALID_FOR_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.SUCCESS_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "/track", CommandTrack.TRACK_MESSAGE),
            Arguments.of(18L, "https://iprody.com/#close", MessageService.INVALID_FOR_TRACK_SITE_MESSAGE),
            Arguments.of(18L, "/track", CommandTrack.TRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.DUPLICATE_TRACKING_MESSAGE),
            Arguments.of(18L, "/untrack", CommandUntrack.UNTRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.SUCCESS_UNTRACK_SITE_MESSAGE),
            Arguments.of(18L, "/untrack", CommandUntrack.UNTRACK_MESSAGE),
            Arguments.of(18L, "https://github.com/sanyarnd", MessageService.DUPLICATE_UNTRACKING_MESSAGE),
            Arguments.of(18L, "NotURL", MessageService.INVALID_FOR_TRACK_SITE_MESSAGE)
        );
    }

    @ParameterizedTest
    @MethodSource("unregisterUserCommands")
    @DisplayName("Test that messages from an unregistered user are handled correctly and returned the correct response")
    void testThatMessagesFromAnUnregisteredUserAreHandledCorrectlyAndReturnedTheCorrectResponse(
        long id,
        String text,
        String exceptedResponse
    ) {
        setUpMockUpdate(id, text);

        var actualResponseService = messageService.prepareResponseMessage(update);
        assertThat(actualResponseService).isEqualTo(exceptedResponse);
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
