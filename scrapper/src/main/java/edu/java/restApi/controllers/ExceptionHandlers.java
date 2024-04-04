package edu.java.restApi.controllers;

import edu.java.restApi.dto.exceptions.DoubleChatRegistrationException;
import edu.java.restApi.dto.exceptions.NoSuchChatException;
import edu.java.restApi.dto.exceptions.NoSuchLinkException;
import edu.java.restApi.dto.response.ApiErrorResponse;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {

    private static final String INCORRECT_REQUEST_PARAMETERS_DESCRIPTION = "Incorrect request parameters";
    private static final String DOUBLE_CHAT_REGISTRATION_DESCRIPTION =
        "Can't register new chat, as it was already registered";
    private static final String NO_SUCH_CHAT_DESCRIPTION = "There is no record about such chat";
    private static final String NO_SUCH_LINK_DESCRIPTION = "There is no record about such link";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiErrorResponse> handleMethodArgumentNotValidException(
        MethodArgumentNotValidException exception
    ) {
        HttpStatusCode statusCode = exception.getStatusCode();
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, INCORRECT_REQUEST_PARAMETERS_DESCRIPTION, exception);

        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    @ExceptionHandler(DoubleChatRegistrationException.class)
    public ResponseEntity<ApiErrorResponse> handleDoubleChatRegistrationException(
        DoubleChatRegistrationException exception
    ) {
        HttpStatusCode statusCode = HttpStatus.NOT_FOUND;
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, DOUBLE_CHAT_REGISTRATION_DESCRIPTION, exception);
        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    @ExceptionHandler(NoSuchChatException.class)
    public ResponseEntity<ApiErrorResponse> handleNoSuchChatException(NoSuchChatException exception) {
        HttpStatusCode statusCode = HttpStatus.CONFLICT;
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, NO_SUCH_CHAT_DESCRIPTION, exception);
        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    @ExceptionHandler(NoSuchLinkException.class)
    public ResponseEntity<ApiErrorResponse> handleNoSuchLinkException(NoSuchLinkException exception) {
        HttpStatusCode statusCode = HttpStatus.NOT_FOUND;
        ApiErrorResponse errorResponse =
            buildDefaultErrorResponse(statusCode, NO_SUCH_LINK_DESCRIPTION, exception);
        return ResponseEntity.status(statusCode).body(errorResponse);
    }

    private ApiErrorResponse buildDefaultErrorResponse(
        HttpStatusCode statusCode,
        String description,
        Exception exception
    ) {
        String exceptionName = exception.getClass().getSimpleName();
        String exceptionMessage = exception.getMessage();
        List<String> stacktrace = Arrays.stream(exception.getStackTrace()).map(StackTraceElement::toString).toList();

        return new ApiErrorResponse(
            description,
            statusCode.toString(),
            exceptionName,
            exceptionMessage,
            stacktrace
        );
    }
}
