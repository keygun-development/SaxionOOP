package nl.saxion.opp.exercise3;

import java.util.ArrayList;

public class User {
    private String userName;
    private String realName;
    private ArrayList<Post> posts = new ArrayList<>();

    public User(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void removePost(Post post) {
        posts.remove(post);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Posts from %s aka %s:\n", realName, userName));
        for (Post post : posts) {
            sb.append(post.toString()).append("\n");
        }
        return sb.toString();
    }
}
