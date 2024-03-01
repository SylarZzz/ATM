import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Main Menu:");
            System.out.println("1. Customer Login");
            System.out.println("2. Administrator Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    displayCustomerMenu();
                    break;
                case 2:
                    displayAdministratorMenu();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void displayCustomerMenu() {
        // Implementation for displaying customer-specific options and handling their inputs
        System.out.println("Customer Menu...");
        // Add customer menu options here
    }

    private void displayAdministratorMenu() {
        // Implementation for displaying administrator-specific options and handling their inputs
        System.out.println("Administrator Menu...");
        // Add administrator menu options here
    }
}
