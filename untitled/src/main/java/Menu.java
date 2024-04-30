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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter pin code: ");
        int pin = scanner.nextInt();

        Account account = new Account(0, login, 0);
        Customer customer = new Customer(0, login, pin, account);

        System.out.println("Customer Menu...");
        customer.displayMenu();

    }

    private void displayAdministratorMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter pin code: ");
        int pin = scanner.nextInt();

        Administrator admin = new Administrator(1, login, pin);

        System.out.println("Administrator Menu...");
        admin.displayMenu();
    }
}
