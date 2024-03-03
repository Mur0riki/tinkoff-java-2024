package edu.java.scrapper.configuration;

import edu.java.configuration.ApplicationConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiUrlTest {

    @Test
    @DisplayName("Should return ConfigURL when it is not null")
    public void shouldReturnConfigUrlWhenItIsNotNull() {
        ApplicationConfig.ApiUrl apiUrl = new ApplicationConfig.ApiUrl("defaultUrl", "configUrl");

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isEqualTo("configUrl");
    }

    @Test
    @DisplayName("Should return defaultUrl when configUrl is null ")
    public void shouldReturnDefaultUrlWhenConfigUrlIsNull() {
        ApplicationConfig.ApiUrl apiUrl = new ApplicationConfig.ApiUrl("defaultUrl", null);

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isNotNull().isEqualTo("defaultUrl");
    }

}
