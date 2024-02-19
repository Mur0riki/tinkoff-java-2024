package edu.java.bot.controller;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import edu.java.bot.service.MessageService;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController implements UpdatesListener {
    private static final Logger MESSAGE_LOGGER = LogManager.getLogger(MessageController.class.getName());
    private final TelegramBot telegramBot;
    private final MessageService messageService;

    public MessageController(TelegramBot telegramBot, MessageService messageService) {
        telegramBot.setUpdatesListener(this);
        this.telegramBot = telegramBot;
        this.messageService = messageService;
    }

    @Override
    public int process(List<Update> list) {
        list.forEach(this::process);
        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }

    private void process(Update u) {
        var message = new SendMessage(
            u.message().chat().id(),
            messageService.prepareResponseMessage(u)
        );
        sendToTelegram(message);
    }

    private void sendToTelegram(SendMessage message) {
        telegramBot.execute(
            message,
            new Callback<SendMessage, SendResponse>() {
                @Override
                public void onResponse(SendMessage request, SendResponse response) {
                    MESSAGE_LOGGER.info("Отправка ответа %s на запрос  %s".formatted(
                        request.toString(),
                        response.message().text()
                    ));
                }

                @Override
                public void onFailure(SendMessage request, IOException e) {
                    MESSAGE_LOGGER.error("Ошибка выполнения запроса: " + e.getMessage());
                }
            }
        );
    }
}
