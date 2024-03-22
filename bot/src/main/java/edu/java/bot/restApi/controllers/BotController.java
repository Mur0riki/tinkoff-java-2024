package edu.java.bot.restApi.controllers;

import edu.java.bot.restApi.dto.request.LinkUpdate;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bot/api/v1")
public class BotController {

    private static final Logger LOGGER = LogManager.getLogger();

    @PostMapping("/updates")
    public ResponseEntity<?> addUpdate(@Valid @RequestBody LinkUpdate linkUpdate) {
        LOGGER.info("Got new linkUpdate: {}", linkUpdate);
        return ResponseEntity.ok().build();
    }
}
