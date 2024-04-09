package edu.java.bot.restApi.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.restApi.dto.request.LinkUpdate;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkUpdateService {

    private final TelegramBot telegramBot;

    public void sendUpdatesToBot(List<LinkUpdate> linkUpdates) {
        linkUpdates.forEach(this::handleLinkUpdate);
    }

    private void handleLinkUpdate(LinkUpdate linkUpdate) {
        String messageText = buildMessageText(linkUpdate);
        List<Integer> chats = linkUpdate.tgChatIds();
        chats.forEach(chatId -> sendMessageToChatId(messageText, chatId));
    }

    private void sendMessageToChatId(String message, long chatId) {
        SendMessage sendMessageRequest = new SendMessage(chatId, message);
        telegramBot.execute(sendMessageRequest);
    }

    private String buildMessageText(LinkUpdate linkUpdate) {
        URI url = URI.create(linkUpdate.url());
        String hostName = url.getHost();
        String updateMessage;
        if(!linkUpdate.type().getMessage().isEmpty()){
            updateMessage = linkUpdate.type().getMessage();
        } else {
            updateMessage = "";
        }

        return "Hello!\n"
            + STR."There is new update on \{hostName}: \{updateMessage}\n"
            + STR."(full url: \{linkUpdate.url()})";
    }

}
