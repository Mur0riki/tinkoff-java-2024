package edu.java.data.dao.initialStateScreeners;

import edu.java.data.postgres.entities.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UniversalInitialStateScreener {

    private final List<InitialStateScreener> initialStateScreeners;

    public boolean saveInitialState(Link link) {
        for (var initialStateScreener : initialStateScreeners) {
            try {
                initialStateScreener.saveInitialState(link);
                return true;
            } catch (IncorrectHostException ex) {
            }
        }
        return false;
    }
}
