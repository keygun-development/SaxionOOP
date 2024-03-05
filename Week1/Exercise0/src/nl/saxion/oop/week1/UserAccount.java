package nl.saxion.oop.week1;

public class UserAccount {
    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}
