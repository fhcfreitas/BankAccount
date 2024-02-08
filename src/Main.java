import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String clientName = "Fábio Freitas";
        String accountType = "Current";
        double balance = 2000.00;
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;
        double money = 0;

        // User Information
        System.out.println("**************************************");
        System.out.println("Welcome to Java Bank!");
        System.out.println("");
        System.out.println("Client Name: " + clientName);
        System.out.println("Accout Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("**************************************");

        // Operational Menu
        String menu = """
           
           *** Operarations ***
           1. See balance
           2. Receive value
           3. Transfer value
           4. Log out
            """;

        // Main loop
        while (userChoice != 4) {
            System.out.println(menu);
            System.out.println("Type the desired option:");
            userChoice = userInput.nextInt();

            if (userChoice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (userChoice == 2) {
                System.out.println("How much will you receive?");
                money = userInput.nextDouble();
                balance += money;
                System.out.println("Operation successfully completed.");
                System.out.println("Your updated balance is: " + (balance));
            } else if (userChoice == 3) {
                System.out.println("How much will you transfer?");
                money = userInput.nextDouble();
                if (money > balance) {
                    System.out.println("You don't have enough balance to this.");
                } else {
                    balance -= money;
                    System.out.println("Operation successfully completed.");
                    System.out.println("Your updated balance is: " + (balance));
                }
            } else if (userChoice == 4) {
                System.out.println("Logging out...");
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Unavailable option. Try again.");
            }
        }
    }
}