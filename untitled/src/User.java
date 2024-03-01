public abstract class User {
    private String userID;
    private String username;
    private String pin;

    public User(String userID, String username, String pin) {
        this.userID = userID;
        this.username = username;
        this.pin = pin;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public abstract void displayMenu();
}
