package edu.java.bot.service;

//import com.pengrad.telegrambot.model.Chat;
//import com.pengrad.telegrambot.model.Message;
//import com.pengrad.telegrambot.model.Update;
//import edu.java.bot.BotApplication;
//import edu.java.bot.commands.Command;
//import edu.java.bot.commands.CommandStart;
//import edu.java.bot.model.SessionState;
//import edu.java.bot.repository.UserService;
//import edu.java.bot.users.User;
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
//class CommandServiceTest {
//    @MockBean
//    Update update;
//
//    @Autowired
//    Map<String, Command> commandMap;
//
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    CommandService commandService;
//
//    @Nested
//    @DisplayName("Test /start")
//    class StartCommandTest {
//        private final Command start = new CommandStart(commandService);
//
//        @Test
//        @DisplayName("Test that a new user can register and returned the id from the database")
//        void testThatANewUserCanRegisterAndReturnedTheIdFromTheDatabase() {
//            Long id_user = 6L;
//            assertThat(userService.findUserById(id_user)).isEmpty();
//
//            mockSetUp(id_user);
//            var actualMessage = start.handle(update.message().chat().id());
//            assertThat(actualMessage).isEqualTo(CommandStart.SUCCESS_REGISTRATION_MESSAGE);
//            start.handle(update.message().chat().id());
//
//            var actualSaveUser = userService.findUserById(id_user);
//            assertThat(actualSaveUser).isPresent();
//            assertThat(actualSaveUser.get().getId()).isEqualTo(id_user);
//        }
//
//        @Test
//        @DisplayName("Test that the user cannot register twice and will returned the correct state of the database")
//        void testThatTheUserCannotRegisterTwiceAndWillReturnedTheCorrectStateOfTheDatabase() {
//            var id_user = 7L;
//            prepareUser(id_user, List.of());
//
//            mockSetUp(id_user);
//            start.handle(update.message().chat().id());
//
//            var actualSaveUser = userService.findUserById(id_user);
//            assertThat(actualSaveUser).isPresent();
//            assertThat(actualSaveUser.stream().count()).isEqualTo(1);
//            assertThat(actualSaveUser.get().getId()).isEqualTo(id_user);
//
//        }
//    }
//
//    @Nested
//    @DisplayName("Test /track and /untrack")
//    class TrackAndUntrackCommandTest {
//        Command track = commandMap.get("/track");
//        Command untrack = commandMap.get("/untrack");
//
//        @Test
//        @DisplayName("Test that using the command changes the state returned the correct state")
//        void testThatUsingTheCommandChangesTheStateReturnedTheCorrectState() {
//            long user_id = 8L;
//            prepareUser(user_id, List.of());
//            mockSetUp(user_id);
//
//            track.handle(update.message().chat().id());
//
//            assertThat(userService.findUserById(user_id)).isPresent();
//            assertThat(userService.findUserById(user_id).get()
//                .getState()).isEqualTo(SessionState.WAIT_URI_FOR_TRACKING);
//
//            untrack.handle(update.message().chat().id());
//            assertThat(userService.findUserById(user_id)).isPresent();
//            assertThat(userService.findUserById(user_id).get()
//                .getState()).isEqualTo(SessionState.WAIT_URI_FOR_UNTRACKING);
//        }
//
//        @Test
//        @DisplayName("Test that the user gets the correct answer returned the waiting input to the registered user")
//        void testThatTheUserGetsTheCorrectAnswerReturnedTheWaitingInputToTheRegisteredUser() {
//            long user_id = 9L;
//            prepareUser(user_id, List.of());
//            mockSetUp(user_id);
//
//            var actualTrackResponse = track.handle(update.message().chat().id());
//
//            assertThat(actualTrackResponse).isEqualTo(CommandService.TRACK_MESSAGE);
//
//            var actualUnTrackResponse = untrack.handle(update.message().chat().id());
//            assertThat(actualUnTrackResponse).isEqualTo(CommandService.UNTRACK_MESSAGE);
//        }
//
//        @Test
//        @DisplayName(
//            "Test that the user gets the correct answer returned the registration requirement to the unregistered user")
//        void testThatTheUserGetsTheCorrectAnswerReturnedTheRegistrationRequirementToTheUnregisteredUser() {
//            long unregisterUserId = 10L;
//            mockSetUp(unregisterUserId);
//
//            var actualTrackResponse = track.handle(update.message().chat().id());
//            assertThat(actualTrackResponse).isEqualTo(CommandService.UNKNOWN_USER_TRACK);
//
//            var actualUnTrackResponse = untrack.handle(update.message().chat().id());
//            assertThat(actualUnTrackResponse).isEqualTo(CommandService.UNKNOWN_USER_UNTRACK);
//        }
//    }
//
//    private void prepareUser(long id, List<URI> listSites) {
//        userService.saveUser(new User(id, listSites);
//    }
//
//    private void mockSetUp(long id_user) {
//        Message messageMock = mock(Message.class);
//        Chat chatMock = mock(Chat.class);
//        when(update.message()).thenReturn(messageMock);
//        when(messageMock.chat()).thenReturn(chatMock);
//        when(chatMock.id()).thenReturn(id_user);
//        when(update.message().chat().id()).thenReturn(id_user);
//    }
//}
