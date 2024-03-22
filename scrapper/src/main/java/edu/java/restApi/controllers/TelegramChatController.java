package edu.java.restApi.controllers;

import jakarta.validation.constraints.Min;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/tg-chat")
public class TelegramChatController {

    private static final Logger LOGGER = LogManager.getLogger();

    @PostMapping("/{id}")
    public ResponseEntity<?> registerChat(@PathVariable @Min(1) int id) {
        LOGGER.debug("Registering chat with id {}...", id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteChat(@PathVariable @Min(1) int id) {
        LOGGER.debug("Deleting chat with id {}...", id);
        return ResponseEntity.ok().build();
    }
}
