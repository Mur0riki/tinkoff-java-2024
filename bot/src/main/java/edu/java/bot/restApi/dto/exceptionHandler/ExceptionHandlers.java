package edu.java.bot.restApi.dto.exceptionHandler;

import edu.java.bot.restApi.dto.response.ApiErrorResponse;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String INCORRECT_PARAMETERS_REQUEST_DESCRIPTION = "Incorret request parametres";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(
        MethodArgumentNotValidException exception) {
        HttpStatusCode statusCode = exception.getStatusCode();
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionMessage = exception.getMessage();
        List<String> stackTrace = Arrays.stream(exception.getStackTrace()).map(StackTraceElement::toString).toList();
        ApiErrorResponse errorResponse = new ApiErrorResponse(
            INCORRECT_PARAMETERS_REQUEST_DESCRIPTION,
            statusCode.toString(),
            exceptionName,
            exceptionMessage,
            stackTrace
        );
        LOGGER.warn(INCORRECT_PARAMETERS_REQUEST_DESCRIPTION + ": {}", errorResponse);
        return ResponseEntity.status(statusCode).body(errorResponse);
    }
}
