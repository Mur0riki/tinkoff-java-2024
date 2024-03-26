package edu.java.bot.url_processor;

import edu.java.bot.BotApplication;
import java.net.URI;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

/*@SpringBootTest(classes = BotApplication.class)
class UrlProcessorTest {
    @Autowired
    private UrlProcessor urlProcessor;

    private static Stream<Arguments> invalidSites() {
        return Stream.of(
            Arguments.of(URI.create("vk.com/necmotritectranitsy")),
            Arguments.of(URI.create("noturl"))
        );
    }

    private static Stream<Arguments> validSites() {
        return Stream.of(
            Arguments.of(URI.create("https://github.com/Mur0riki")),
            Arguments.of(URI.create("https://stackoverflow.com/questions"))
        );
    }

    @ParameterizedTest
    @MethodSource("invalidSites")
    @DisplayName("Test that invalid link are being processed correctly and returned false")
    void testThatInvalidLinkAreBeingProcessedCorrectlyAndReturnedFalse(URI uri) {
        var actualResult = urlProcessor.isValidUrl(uri);
        assertThat(actualResult).isFalse();
    }

    @ParameterizedTest
    @MethodSource("validSites")
    @DisplayName("Test that valid link are being processed correctly and returned true")
    void testThatValidLinkAreBeingProcessedCorrectlyAndReturnedTrue(URI uri) {
        var actualResult = urlProcessor.isValidUrl(uri);
        assertThat(actualResult).isTrue();
    }
}*/
