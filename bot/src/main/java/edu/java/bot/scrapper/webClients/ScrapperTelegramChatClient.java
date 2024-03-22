package edu.java.bot.scrapper.webClients;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange("/tg-chat")
public interface ScrapperTelegramChatClient {

    @PostExchange(url = "/{id}")
    ResponseEntity<?> registerNewChat(@PathVariable int id);

    @DeleteExchange(url = "/{id}")
    ResponseEntity<?> deleteChat(@PathVariable int id);
}
