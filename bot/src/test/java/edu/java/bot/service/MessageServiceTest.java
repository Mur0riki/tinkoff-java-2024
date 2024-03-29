package edu.java.bot.service;

//import com.pengrad.telegrambot.model.Chat;
//import com.pengrad.telegrambot.model.Message;
//import com.pengrad.telegrambot.model.Update;
//import edu.java.bot.BotApplication;
//import edu.java.bot.commands.CommandList;
//import java.util.stream.Stream;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest(classes = {BotApplication.class})
//class MessageServiceTest {
//    @MockBean Update update;
//
//    @Autowired MessageService messageService;
//
//    private static Stream<Arguments> unregisterUserCommands() {
//        return Stream.of(
//            Arguments.of(1L, "привет", MessageService.INVALID_COMMAND_MESSAGE),
//            Arguments.of(3L, "/track https://github.com/Mur0riki/newRepository", CommandService.UNKNOWN_USER_TRACK),
//            Arguments.of(4L, "/untrack https://github.com/Mur0riki/newRepository", CommandService.UNKNOWN_USER_UNTRACK),
//            Arguments.of(5L, "other message", MessageService.INVALID_COMMAND_MESSAGE)
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("unregisterUserCommands")
//    @DisplayName("Test that messages from an unregistered user are handled correctly and returned the correct response")
//    void testThatMessagesFromAnUnregisteredUserAreHandledCorrectlyAndReturnedTheCorrectResponse(
//        long id,
//        String text,
//        String exceptedResponse
//    ) {
//        setUpMockUpdate(id, text);
//
//        var actualResponseService = messageService.prepareResponseMessage(update);
//        assertThat(actualResponseService).isEqualTo(exceptedResponse);
//    }
//
//    private void setUpMockUpdate(long id, String text) {
//        Message messageMock = mock(Message.class);
//        Chat chatMock = mock(Chat.class);
//
//        when(update.message()).thenReturn(messageMock);
//        when(messageMock.chat()).thenReturn(chatMock);
//
//        when(chatMock.id()).thenReturn(id);
//        when(update.message().chat().id()).thenReturn(id);
//
//        when(messageMock.text()).thenReturn(text);
//        when(update.message().text()).thenReturn(text);
//    }
//
//}
