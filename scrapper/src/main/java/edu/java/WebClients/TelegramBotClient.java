package edu.java.WebClients;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange
public interface TelegramBotClient {

    @PostExchange(url = "/updates")
    ResponseEntity<?> sendLinkUpdate(@RequestBody LinkUpdate linkUpdate);
}
