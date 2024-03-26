package edu.java.bot.scrapper.webClients;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange("/tg-chat")
@RestController
public interface ScrapperTelegramChatClient {

    @PostExchange(url = "/{id}")
    void registerNewChat(@PathVariable long id);

    @DeleteExchange(url = "/{id}")
    void deleteChat(@PathVariable long id);
}
