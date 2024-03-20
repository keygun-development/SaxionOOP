package nl.saxion.opp.exercise3;

import java.time.LocalDateTime;

public class Comment {
    private String comment;
    private User from;

    public Comment(String comment, User from) {
        this.comment = comment;
        this.from = from;
    }

    public User getFrom() {
        return from;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    public String getComment() {
        return comment;
    }

    public String toString() {
        return from.getUserName() + ": " + comment;
    }
}
