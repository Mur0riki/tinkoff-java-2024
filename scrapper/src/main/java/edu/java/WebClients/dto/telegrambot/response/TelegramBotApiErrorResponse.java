package edu.java.WebClients.dto.telegrambot.response;

import edu.java.WebClients.exception.ClientErrorResponseBody;
import java.util.List;

public record TelegramBotApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {
}
