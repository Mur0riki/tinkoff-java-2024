package edu.java.scrapper;

import edu.java.configuration.ApplicationConfig;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiUrlTest {

    @Test
    public void should_returnConfigUrl_when_itIsNotNull() {
        ApplicationConfig.ApiUrl apiUrl = new ApplicationConfig.ApiUrl("defaultUrl", "configUrl");

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isEqualTo("configUrl");
    }

    @Test
    public void should_returnDefaultUrl_when_configUrlIsNull() {
        ApplicationConfig.ApiUrl apiUrl = new ApplicationConfig.ApiUrl("defaultUrl", null);

        String actualBaseUrl = apiUrl.getBaseUrl();

        assertThat(actualBaseUrl).isNotNull().isEqualTo("defaultUrl");
    }

}
