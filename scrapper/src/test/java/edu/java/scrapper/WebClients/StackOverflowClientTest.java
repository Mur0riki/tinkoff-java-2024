package edu.java.scrapper.WebClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.WebClients.StackOverflowClient;
import edu.java.WebClients.dto.stackoverflow.StackOverflowOwner;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestion;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import edu.java.configuration.ApplicationConfig;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;

@WireMockTest(httpPort = 8075)
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.yml")
@ActiveProfiles("test")
class StackOverflowClientTest {

    @Autowired
    StackOverflowClient stackOverflowClient;

    @Test
    @DisplayName("When API call is ok should return correct Qusetion info")
    void henAPICallIsOkShouldReturnCorrectQuestionInfo() {
        stubFor(get((urlEqualTo("questions/123?site=stackoverflow&filter=withbody")))
            .willReturn(aResponse().withBody("""
                "items": [
                         {
                             "tags": [
                                 "java",
                                 "xml",
                                 "csv",
                                 "data-conversion"
                             ],
                             "owner": {
                                 "account_id": 64,
                                 "reputation": 1325,
                                 "user_id": 78,
                                 "user_type": "registered",
                                 "accept_rate": 75,
                                 "profile_image": "https://www.gravatar.com/avatar/90f0ea16725b9f41c2121b40e2cc45cd?s=256&d=identicon&r=PG",
                                 "display_name": "A Salim",
                                 "link": "https://stackoverflow.com/users/78/a-salim"
                             },
                             "is_answered": true,
                             "view_count": 81115,
                             "protected_date": 1433355035,
                             "closed_date": 1543288543,
                             "accepted_answer_id": 183,
                             "answer_count": 16,
                             "score": 121,
                             "last_activity_date": 1590400952,
                             "creation_date": 1217606932,
                             "last_edit_date": 1445938449,
                             "question_id": 123,
                             "link": "https://stackoverflow.com/questions/123/java-lib-or-app-to-convert-csv-to-xml-file",
                             "closed_reason": "Not suitable for this site",
                             "title": "Java lib or app to convert CSV to XML file?",
                             "body": "<p>Is there an existing application or library in <em>Java</em> which will allow me to convert a <code>CSV</code> data file to <code>XML</code> file?  </p>\\n\\n<p>The <code>XML</code> tags would be provided through possibly the first row containing column headings.</p>\\n"
                         }
                     ],
                     "has_more": false,
                     "quota_max": 300,
                     "quota_remaining": 291
                 }"""))
        );
        ResponseEntity<StackOverflowResponse<StackOverflowQuestion>> actualResponse =
            stackOverflowClient.findQuestionById(123);

        Instant creationDate = Instant.ofEpochSecond(1217606932);
        Instant closedDate = Instant.ofEpochSecond(1543288543);
        StackOverflowQuestion expectedQuestion = new StackOverflowQuestion(
            0,
            List.of("java",
                "xml",
                "csv",
                "data-conversion"),
            new StackOverflowOwner("A Salim"),
            "Java lib or app to convert CSV to XML file?",
            true,
            16,
            "<p>Is there an existing application or library in <em>Java</em> which will allow me to convert a <code>CSV</code> data file to <code>XML</code> file?  </p>\n\n<p>The <code>XML</code> tags would be provided through possibly the first row containing column headings.</p>\n",
            OffsetDateTime.ofInstant(creationDate, ZoneOffset.UTC),
            OffsetDateTime.ofInstant(closedDate, ZoneOffset.UTC),
            "Not suitable for this site"
        );

        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isNotNull();
        assertThat(actualResponse.getBody().items()).isNotNull().containsExactly(expectedQuestion);
    }

}
