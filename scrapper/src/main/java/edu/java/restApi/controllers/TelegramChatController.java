package edu.java.restApi.controllers;

import edu.java.restApi.dto.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.service.TelegramChatService;
import jakarta.validation.constraints.Min;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/tg-chat")
public class TelegramChatController {

    private final TelegramChatService chatService;
    private static final String DOUBLE_CHAT_REGISTRATION_DESCRIPTION =
        "Can't register new chat, as it was already registered";

    @Autowired
    public TelegramChatController(TelegramChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> registerChat(@PathVariable @Min(1) long id) {
        try {
            chatService.registerChat(id);
        } catch (DoubleChatRegistrationException e) {
            return ResponseEntity.of(Optional.of(new DoubleChatRegistrationException("Вы уже зарегистрированы")));
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteChat(@PathVariable @Min(1) long id) {
        chatService.deleteChat(id);
        return ResponseEntity.ok().build();
    }
}
