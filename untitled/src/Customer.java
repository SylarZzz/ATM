import java.util.Scanner;

public class Customer extends User {
    private Account account;

    public Customer(String userID, String username, String pin, Account account) {
        super(userID, username, pin);
        this.account = account;
    }

    @Override
    public void displayMenu() {
        System.out.println("Customer Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. View Transaction History");
        System.out.print("Enter a number (1-4) to perform the corresponding action: ");

        Scanner input = new Scanner(System.in);
        int action = input.nextInt();

        switch (action) {

            case 1:
                checkBalance();
                break;

            case 2:
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = input.nextInt();
                if (depositAmount <= 0) {
                    System.out.println("Cannot deposit 0 or negative amount.");
                }
                depositFunds(depositAmount);
                break;

            case 3:
                System.out.print("Enter the amount to withdraw: ");
                int withdrawAmount = input.nextInt();
                if (withdrawAmount <= 0) {
                    System.out.println("Cannot withdraw 0 or negative amount.");
                }
                withdrawFunds(withdrawAmount);
                break;

            case 4:
                viewTransactionHistory();
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void depositFunds(double amount) {
        account.deposit(amount);
        System.out.println("Deposited: $" + amount);
    }

    public void withdrawFunds(double amount) {
        boolean success = account.withdraw(amount);
        if(success) {
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void viewTransactionHistory() {

    }
}
