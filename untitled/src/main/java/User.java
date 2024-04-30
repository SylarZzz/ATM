public abstract class User {
    private int userID;
    private String username;
    private int pin;

    public User(int userID, String username, int pin) {
        this.userID = userID;
        this.username = username;
        this.pin = pin;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public abstract void displayMenu();
}
