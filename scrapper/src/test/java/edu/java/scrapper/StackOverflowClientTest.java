package edu.java.scrapper;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowOwner;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import edu.java.data.postgres.entities.StackOverflowQuestion;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static org.assertj.core.api.Assertions.assertThat;

public class StackOverflowClientTest extends WebClientTest {

    @Autowired
    StackOverflowClientInBeanConfiguration stackOverflowClient;

    @Test
    public void should_returnQuestion() {
        //Arrange
        mockServer.stubFor(get("/questions/123?site=stackoverflow&filter=withbody").
            willReturn(okJson("""
                {
                    "items":[
                                {
                                    "question_id": 123,
                                    "tags" :[
                                        "Java","Spring"
                                    ],
                                    "owner": {
                                        "display_name" : "customName"
                                    },
                                    "title": "super question!",
                                    "is_answered": true,
                                    "answer_count": 321,
                                    "body": "test question body",
                                    "creation_date": 567,
                                    "last_activity_date": 770,
                                    "closed_date": 890,
                                    "closed_reason": "test closed reason"
                                }
                        ],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        StackOverflowResponse<StackOverflowQuestionBody> actualResponse =
            stackOverflowClient.findQuestionById(123).getBody();

        //Assert
        Instant creationDate = Instant.ofEpochSecond(567);
        Instant closedDate = Instant.ofEpochSecond(890);
        Instant lastActivityDate = Instant.ofEpochSecond(770);
        StackOverflowQuestionBody expectedQuestion = new StackOverflowQuestionBody(
            123,
            List.of("Java", "Spring"),
            new StackOverflowOwner("customName"),
            "super question!",
            true,
            321,
            "test question body",
            OffsetDateTime.ofInstant(creationDate, ZoneOffset.UTC),
            OffsetDateTime.ofInstant(lastActivityDate,ZoneOffset.UTC),
            OffsetDateTime.ofInstant(closedDate, ZoneOffset.UTC),
            "test closed reason"
        );

        assertThat(actualResponse).isNotNull();
        assertThat(actualResponse).isEqualTo(expectedQuestion);
    }

    @Test
    public void should_returnAnswers() {
        //Arrange
        mockServer.stubFor(get("/questions/123/answers?site=stackoverflow&filter=withbody")
            .willReturn(okJson("""
                {
                    "items": [
                        {
                           "answer_id": 1,
                           "owner": {
                                "display_name": "customName1"
                           },
                           "is_accepted": true,
                           "score": 123,
                           "body": "This is first answer",
                           "creation_date": 567
                        },
                        {
                           "answer_id": 2,
                           "owner": {
                                "display_name": "customName2"
                           },
                           "is_accepted": false,
                           "score": 456,
                           "body": "This is second answer",
                           "creation_date": 890
                        }
                    ],
                    "hase_more": false,
                    "quota_max": 300,
                    "quota_remaining": 299
                }""")
            )
        );

        //Act
        StackOverflowResponse<StackOverflowAnswer> actualResponse =
            stackOverflowClient.findAnswersByQuestionId(123).getBody();

        //Assert
        Instant creationDate1 = Instant.ofEpochSecond(567);
        Instant creationDate2 = Instant.ofEpochSecond(890);
        List<StackOverflowAnswer> expectedAnswerList = List.of(
            new StackOverflowAnswer(
                1,
                new StackOverflowOwner("customName1"),
                true,
                123,
                "This is first answer",
                OffsetDateTime.ofInstant(creationDate1, ZoneOffset.UTC)
            ),
            new StackOverflowAnswer(
                2,
                new StackOverflowOwner("customName2"),
                false,
                456,
                "This is second answer",
                OffsetDateTime.ofInstant(creationDate2, ZoneOffset.UTC)
            )
        );

        assertThat(actualResponse).isNotNull();
        assertThat(actualResponse.items()).isNotNull()
            .containsExactlyInAnyOrderElementsOf(expectedAnswerList);
    }
}
