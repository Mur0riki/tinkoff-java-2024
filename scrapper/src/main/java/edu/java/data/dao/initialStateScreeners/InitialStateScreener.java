package edu.java.data.dao.initialStateScreeners;

import edu.java.data.dto.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;

public interface InitialStateScreener {

    void saveInitialState(Link link) throws IncorrectHostException;

}
