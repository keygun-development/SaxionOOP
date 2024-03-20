package nl.saxion.opp.exercise3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
    private String description;
    private ArrayList<User> likes = new ArrayList<>();
    private ArrayList<Comment> comments = new ArrayList<>();
    private ArrayList<User> userLikes = new ArrayList<>();

    public Post(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }

    public void like(User user) {
        likes.add(user);
    }

    public void unlike(User user) {
        likes.remove(user);
    }

    public int getNumberOfLikes() {
        return userLikes.size();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDateTime()+": "+description+"(likes: "+getNumberOfLikes()+")\nComments: "+comments.size()+"\n");
        for (Comment comment : comments) {
            sb.append(comment.toString()).append("\n");
        }
        return sb.toString();
    }
}
