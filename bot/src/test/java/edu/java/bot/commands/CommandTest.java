package edu.java.bot.commands;

//import com.pengrad.telegrambot.model.Chat;
//import com.pengrad.telegrambot.model.Message;
//import com.pengrad.telegrambot.model.Update;
//import edu.java.bot.BotApplication;
//import java.net.URI;
//import java.util.List;
//import java.util.Map;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//@SpringBootTest(classes = {BotApplication.class})
//public class CommandTest {
//    @MockBean
//    Update update;
//
//    @Autowired
//    Map<String, Command> commandMap;
//
//    private void mockSetUp(long id_user) {
//        Message messageMock = mock(Message.class);
//        Chat chatMock = mock(Chat.class);
//        when(update.message()).thenReturn(messageMock);
//        when(messageMock.chat()).thenReturn(chatMock);
//        when(chatMock.id()).thenReturn(id_user);
//        when(update.message().chat().id()).thenReturn(id_user);
//    }
//
//    @Nested
//    @DisplayName("Test /help")
//    class TestHelpCommand {
//        Command help = commandMap.get("/help");
//        private final String expectedMessage = "Команды бота:\n" +
//            "/list - Позволяет вам увидеть список сайтов которые вы решили отслеживать.\n" +
//            "/start - Позволяет зарегистрироваться в нашей системе.\n" +
//            "/track - Позволяет начать отслеживать в нашем боте нужный вам сайт.\n" +
//            "/untrack - Позволяет вам прекратить отлеживать один из сайтов которые вы ранее хотели отслеживать.\n" +
//            "/help - Позволяет увидеть всё доступные команды бота.\n";
//
//        @Test
//        @DisplayName("Test that help command returned correct command list and their description")
//        void testThatHelpCommandReturnedCorrectCommandListAndTheirDescription() {
//            mockSetUp(11L);
//            prepareUser(11L, List.of());
//            var ActualMessage = help.handle(update.message().chat().id());
//            assertThat(expectedMessage).isEqualTo(ActualMessage);
//        }
//
//        @Test
//        @DisplayName("Test that the team returned the message to all users")
//        void testThatTheTeamReturnedTheMessageToAllUsers() {
//            mockSetUp(12L);
//            prepareUser(12L, List.of());
//            var actualMessageForRegisterUser = help.handle(update.message().chat().id());
//
//            mockSetUp(13L);
//            var actualMessageForUnRegisterUser = help.handle(update.message().chat().id());
//
//            assertThat(expectedMessage).isEqualTo(actualMessageForRegisterUser);
//            assertThat(expectedMessage).isEqualTo(actualMessageForUnRegisterUser);
//        }
//    }
//
//    @Nested
//    @DisplayName("Test /list")
//    class ListCommandTest {
//        private final Command list = commandMap.get("/list");
//
//        @Test
//        @DisplayName("Test that the /list returned a correct message for a user with an empty list of links")
//        void testThatTheCommandReturnedASpecialMessageForAUserWithAnEmptyListOfLinks() {
//            var exceptedSpecialMessage = CommandList.EMPTY_SITES_LIST;
//            long user_id = 15L;
//            mockSetUp(user_id);
//            prepareUser(user_id, List.of());
//
//            var actualMessage = list.handle(update.message().chat().id(),new String[]);
//
//            assertThat(actualMessage).isEqualTo(exceptedSpecialMessage);
//        }
//
//        @Test
//        @DisplayName(
//            "Test that the /list returned a expected list sites message for a user with an non-empty list of links")
//        void testThatTheCommandReturnedAExceptedListSitesMessageForAUserWithAnNonEmptyListOfLinks() {
//            var exceptedMessage = "Вы отслеживаете 2 сайтов\n" +
//                "https://github.com/Mur0riki/java-course-2024\n" +
//                "https://github.com/Mur0riki/tinkoff-java-2024/pull/1";
//            long user_id = 16L;
//            mockSetUp(user_id);
//            prepareUser(
//                user_id,
//                List.of(
//                    URI.create("https://github.com/Mur0riki/java-course-2024"),
//                    URI.create("https://github.com/Mur0riki/tinkoff-java-2024/pull/1")
//                )
//            );
//
//            var actualMessage = list.handle(update.message().chat().id());
//
//            assertThat(actualMessage).isEqualTo(exceptedMessage);
//        }
//
//        @Test
//        @DisplayName("Test that the /list returned correct message to an unregistered user")
//        void testThatTheCommandReturnedCorrectMessageToAnUnregisteredUser() {
//            long user_id = 17L;
//            mockSetUp(user_id);
//
//            var actualMessage = list.handle(update.message().chat().id());
//
//            assertThat(actualMessage).isEqualTo(CommandList.UNKNOWN_USER);
//        }
//    }
//}
