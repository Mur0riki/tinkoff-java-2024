package edu.java.configuration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@EnableScheduling
public record ApplicationConfig(

    @Bean
    @NotNull
    ApplicationConfig.Scheduler scheduler,
    @NotNull
    ApiUrl gitHubUrl,
    @NotNull
    ApiUrl stackOverflowUrl,
    @NotNull
    ApiUrl telegramBotUrl,

    @NotNull
    DatabaseAccessType databaseAccessType

) {
    public record Scheduler(boolean enable, @NotNull Duration interval, @NotNull Duration forceCheckDelay) {
    }

    public record ApiUrl(@NotBlank String defaultUrl, String configUrl) {
        public String getBaseUrl() {
            if (configUrl == null) {
                return defaultUrl;
            }
            return configUrl;
        }
    }

    public enum DatabaseAccessType {
        JDBC, JPA, JOOQ
    }
}
