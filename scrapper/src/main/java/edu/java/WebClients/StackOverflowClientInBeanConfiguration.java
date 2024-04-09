package edu.java.WebClients;

import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface StackOverflowClientInBeanConfiguration {
    @GetExchange(url = "questions/{id}?site=stackoverflow&filter=withbody")
    ResponseEntity<StackOverflowResponse<StackOverflowQuestionBody>> findQuestionById(@PathVariable long id);

    @GetExchange(url = "questions/{id}/answers?site=stackoverflow&filter=withbody")
    ResponseEntity<StackOverflowResponse<StackOverflowAnswer>> findAnswersByQuestionId(@PathVariable long id);

}
