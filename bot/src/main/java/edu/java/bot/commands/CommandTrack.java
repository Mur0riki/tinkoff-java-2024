package edu.java.bot.commands;

import edu.java.bot.service.TrackingUntrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("/track")
public class CommandTrack implements Command {
    @Autowired
    private TrackingUntrackingService trackingUntrackingService;

    @Override
    public String command() {
        return "/track";
    }

    @Override
    public String description() {
        return "Позволяет начать отслеживать в нашем боте нужный вам сайт.";
    }

    @Override
    public String handle(long chatId, String[] textMessage) {
        return trackingUntrackingService.executeTrackCommand(chatId, textMessage);
    }
}
