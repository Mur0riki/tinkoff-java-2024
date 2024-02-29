package edu.java.bot.scrapper.dto.response;

import java.util.List;
import edu.java.bot.scrapper.exceptions.ClientErrorResponseBody;

public record ScrapperApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {

}
