import java.util.Scanner;

public class Administrator extends User {
    public Administrator(String userID, String username, String pin) {
        super(userID, username, pin);
    }

    @Override
    public void displayMenu() {
        System.out.println("Administrator Menu:");
        System.out.println("1. Create User Account");
        System.out.println("2. Update User Account");
        System.out.println("3. Delete User Account");
        System.out.println("4. View Reports");

        Scanner input = new Scanner(System.in);
        int action = input.nextInt();

        switch (action) {

            case 1:
                createUserAccount();
                break;

            case 2:
                updateUserAccount();
                break;

            case 3:
                deleteUserAccount();
                break;

            case 4:
                viewReports();
                break;
        }
    }

    public void createUserAccount() {
        System.out.println("Creating a new user account...");
    }

    public void updateUserAccount() {
        System.out.println("Updating an existing user account...");
    }

    public void deleteUserAccount() {
        System.out.println("Deleting a user account...");
    }

    public void viewReports() {
        System.out.println("Viewing reports...");
    }
}
