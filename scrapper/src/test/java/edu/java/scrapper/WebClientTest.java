package edu.java.scrapper;

import com.github.tomakehurst.wiremock.core.Options;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
public abstract class WebClientTest {

    static int WIRE_MOCK_PORT = 8080;

    @RegisterExtension
    static WireMockExtension mockServer = WireMockExtension.newInstance()
        .options(customWireMockConfig())
        .build();

    static Options customWireMockConfig() {
        return wireMockConfig().port(WIRE_MOCK_PORT);
    }
}
