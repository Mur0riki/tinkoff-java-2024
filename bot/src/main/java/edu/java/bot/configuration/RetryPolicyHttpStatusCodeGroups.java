package edu.java.bot.configuration;

import org.springframework.http.HttpStatusCode;

public enum RetryPolicyHttpStatusCodeGroups {
    INFORMATIONAL, SUCCESSFUL, REDIRECTION, CLIENT_ERROR, SERVER_ERROR;

    @SuppressWarnings({"ReturnCount", "MagicNumber"})
    public static RetryPolicyHttpStatusCodeGroups getGroupByStatusCode(int statusCode) {
        if (statusCode >= 100 && statusCode < 200) {
            return INFORMATIONAL;
        } else if (statusCode >= 200 && statusCode < 300) {
            return SUCCESSFUL;
        } else if (statusCode >= 300 && statusCode < 400) {
            return REDIRECTION;
        } else if (statusCode >= 400 && statusCode < 500) {
            return CLIENT_ERROR;
        } else if (statusCode >= 500 && statusCode < 600) {
            return SERVER_ERROR;
        } else {
            throw new IllegalArgumentException("Invalid status code: " + statusCode);
        }
    }

    public static RetryPolicyHttpStatusCodeGroups getGroupByStatusCode(HttpStatusCode statusCode) {
        return getGroupByStatusCode(statusCode.value());
    }

}
