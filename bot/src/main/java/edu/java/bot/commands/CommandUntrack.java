package edu.java.bot.commands;

import edu.java.bot.service.TrackingUntrackingService;
import org.springframework.stereotype.Component;

@Component("/untrack")
public class CommandUntrack implements Command {
    private final TrackingUntrackingService trackingUntrackingService;

    public CommandUntrack(TrackingUntrackingService trackingUntrackingService) {
        this.trackingUntrackingService = trackingUntrackingService;
    }

    @Override
    public String command() {
        return "/untrack";
    }

    @Override
    public String description() {
        return "Позволяет вам прекратить отлеживать один из сайтов которые вы ранее хотели отслеживать.";
    }

    @Override
    public String handle(long chatId, String[] textMessage) {
        return trackingUntrackingService.executreUntrackCommand(chatId, textMessage);
    }
}
