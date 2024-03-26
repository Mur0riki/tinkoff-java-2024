package edu.java.bot.commands;

public interface Command {
    String command();

    String description();

    /**
     * Method that executes the command action.
     *
     * @param chatId the chatId that came to the telegram bot.
     * @return response message to the executed command.
     */

    String handle(long chatId, String[] textMessage);

}
