package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import edu.java.bot.BotApplication;
import edu.java.bot.model.SessionState;
import edu.java.bot.users.User;
import edu.java.bot.processor.CommandHandler;
import edu.java.bot.repository.UserService;
import java.net.URI;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {BotApplication.class})
public class CommandTest {
    @MockBean
    Update update;

    @Autowired
    CommandHandler commandHandler;

    @Autowired
    UserService userService;

    @Nested
    @DisplayName("Test /start")
    class StartCommandTest {
        private final Command start = new CommandStart(userService);

        @Test
        @DisplayName("Test that a new user can register and returned the id from the database")
        void testThatANewUserCanRegisterAndReturnedTheIdFromTheDatabase() {
            Long id_user = 6L;
            assertThat(userService.findUserById(id_user)).isEmpty();

            mockSetUp(id_user);
            var actualMessage = start.handle(update);
            assertThat(actualMessage).isEqualTo(CommandStart.SUCCESS_REGISTRATION_MESSAGE);
            start.handle(update);

            var actualSaveUser = userService.findUserById(id_user);
            assertThat(actualSaveUser).isPresent();
            assertThat(actualSaveUser.get().getId()).isEqualTo(id_user);
        }

        @Test
        @DisplayName("Test that the user cannot register twice and will returned the correct state of the database")
        void testThatTheUserCannotRegisterTwiceAndWillReturnedTheCorrectStateOfTheDatabase() {
            var id_user = 7L;
            prepareUser(id_user, List.of());

            mockSetUp(id_user);
            start.handle(update);

            var actualSaveUser = userService.findUserById(id_user);
            assertThat(actualSaveUser).isPresent();
            assertThat(actualSaveUser.stream().count()).isEqualTo(1);
            assertThat(actualSaveUser.get().getId()).isEqualTo(id_user);

        }
    }

    @Nested
    @DisplayName("Test /track and /untrack")
    class TrackAndUntrackCommandTest {
        Command track = commandHandler.getCommand("/track").get();
        Command untrack = commandHandler.getCommand("/untrack").get();

        @Test
        @DisplayName("Test that using the command changes the state returned the correct state")
        void testThatUsingTheCommandChangesTheStateReturnedTheCorrectState() {
            long user_id = 8L;
            prepareUser(user_id, List.of());
            mockSetUp(user_id);

            track.handle(update);

            assertThat(userService.findUserById(user_id)).isPresent();
            assertThat(userService.findUserById(user_id).get()
                .getState()).isEqualTo(SessionState.WAIT_URI_FOR_TRACKING);

            untrack.handle(update);
            assertThat(userService.findUserById(user_id)).isPresent();
            assertThat(userService.findUserById(user_id).get()
                .getState()).isEqualTo(SessionState.WAIT_URI_FOR_UNTRACKING);
        }

        @Test
        @DisplayName("Test that the user gets the correct answer returned the waiting input to the registered user")
        void testThatTheUserGetsTheCorrectAnswerReturnedTheWaitingInputToTheRegisteredUser() {
            long user_id = 9L;
            prepareUser(user_id, List.of());
            mockSetUp(user_id);

            var actualTrackResponse = track.handle(update);

            assertThat(actualTrackResponse).isEqualTo(CommandTrack.TRACK_MESSAGE);

            var actualUnTrackResponse = untrack.handle(update);
            assertThat(actualUnTrackResponse).isEqualTo(CommandUntrack.UNTRACK_MESSAGE);
        }

        @Test
        @DisplayName(
            "Test that the user gets the correct answer returned the registration requirement to the unregistered user")
        void testThatTheUserGetsTheCorrectAnswerReturnedTheRegistrationRequirementToTheUnregisteredUser() {
            long unregisterUserId = 10L;
            mockSetUp(unregisterUserId);

            var actualTrackResponse = track.handle(update);
            assertThat(actualTrackResponse).isEqualTo(CommandTrack.UNKNOWN_USER);

            var actualUnTrackResponse = untrack.handle(update);
            assertThat(actualUnTrackResponse).isEqualTo(CommandUntrack.UNKNOWN_USER);
        }
    }

    private void prepareUser(long id, List<URI> listSites) {
        userService.saveUser(new User(id, listSites, SessionState.BASE_STATE));
    }

    private void mockSetUp(long id_user) {
        Message messageMock = mock(Message.class);
        Chat chatMock = mock(Chat.class);
        when(update.message()).thenReturn(messageMock);
        when(messageMock.chat()).thenReturn(chatMock);
        when(chatMock.id()).thenReturn(id_user);
        when(update.message().chat().id()).thenReturn(id_user);
    }

    @Nested
    @DisplayName("Test /help")
    class TestHelpCommand {
        Command help = commandHandler.getCommand("/help").get();
        private final String expectedMessage = "Команды бота:\n" +
            "/start - Позволяет зарегистрироваться в нашей системе.\n" +
            "/list - Позволяет вам увидеть список сайтов которые вы решили отслеживать.\n" +
            "/track - Позволяет начать отслеживать в нашем боте нужный вам сайт.\n" +
            "/untrack - Позволяет вам прекратить отлеживать один из сайтов которые вы ранее хотели отслеживать.\n";

        @Test
        @DisplayName("Test that help command returned correct command list and their description")
        void testThatHelpCommandReturnedCorrectCommandListAndTheirDescription() {
            mockSetUp(11L);
            prepareUser(11L, List.of());
            var ActualMessage = help.handle(update);
            assertThat(expectedMessage).isEqualTo(ActualMessage);
        }

        @Test
        @DisplayName("Test that the team returned the message to all users")
        void testThatTheTeamReturnedTheMessageToAllUsers() {
            mockSetUp(12L);
            prepareUser(12L, List.of());
            var actualMessageForRegisterUser = help.handle(update);

            mockSetUp(13L);
            var actualMessageForUnRegisterUser = help.handle(update);

            assertThat(expectedMessage).isEqualTo(actualMessageForRegisterUser);
            assertThat(expectedMessage).isEqualTo(actualMessageForUnRegisterUser);
        }
    }

    @Nested
    @DisplayName("Test /list")
    class ListCommandTest {
        private final Command list = commandHandler.getCommand("/list").get();

        @Test
        @DisplayName("Test that the /list returned a correct message for a user with an empty list of links")
        void testThatTheCommandReturnedASpecialMessageForAUserWithAnEmptyListOfLinks() {
            var exceptedSpecialMessage = CommandList.EMPTY_SITES_LIST;
            long user_id = 15L;
            mockSetUp(user_id);
            prepareUser(user_id, List.of());

            var actualMessage = list.handle(update);

            assertThat(actualMessage).isEqualTo(exceptedSpecialMessage);
        }

        @Test
        @DisplayName(
            "Test that the /list returned a expected list sites message for a user with an non-empty list of links")
        void testThatTheCommandReturnedAExceptedListSitesMessageForAUserWithAnNonEmptyListOfLinks() {
            var exceptedMessage = "Вы отслеживаете 1 сайтов\n" +
                "https://github.com/Mur0riki/java-course-2024\n";
            long user_id = 16L;
            mockSetUp(user_id);
            prepareUser(user_id, List.of(URI.create("https://github.com/Mur0riki/java-course-2024")));

            var actualMessage = list.handle(update);

            assertThat(actualMessage).isEqualTo(exceptedMessage);
        }

        @Test
        @DisplayName("Test that the /list returned correct message to an unregistered user")
        void testThatTheCommandReturnedCorrectMessageToAnUnregisteredUser() {
            long user_id = 17L;
            mockSetUp(user_id);

            var actualMessage = list.handle(update);

            assertThat(actualMessage).isEqualTo(CommandList.UNKNOWN_USER);
        }
    }
}
