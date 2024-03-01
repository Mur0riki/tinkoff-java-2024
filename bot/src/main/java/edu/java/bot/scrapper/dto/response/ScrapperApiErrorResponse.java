package edu.java.bot.scrapper.dto.response;

import edu.java.bot.scrapper.exceptions.ClientErrorResponseBody;
import java.util.List;

public record ScrapperApiErrorResponse(
    String description,
    String code,
    String exceptionName,
    String exceptionMessage,
    List<String> stacktrace
) implements ClientErrorResponseBody {

}
