package edu.java.bot.users;

import edu.java.bot.model.SessionState;
import java.net.URI;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;
    private List<URI> sites;
    private SessionState state;

    public User(Long id, List<URI> sites, SessionState state) {
        this.id = id;
        this.sites = sites;
        this.state = state;
    }

    public boolean isWaitingForTracking() {
        return this.state == (SessionState.WAIT_URI_FOR_TRACKING);
    }

    public boolean isWaitingForUntracking() {
        return this.state == (SessionState.WAIT_URI_FOR_UNTRACKING);
    }
}
