import bank.Bank;
import bank.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // User details
        User userOne = new User("Jerry","BO10006789");

        // Welcome to the BankApp
        Bank bankApp = new Bank(userOne);
        bankApp.welcome();
        bankApp.currentAccount();

        // Main Menu
        //System.out.println(lineSeparator());
        System.out.println("********************");
        System.out.println("(W) Withdraw");
        System.out.println("(D) Deposit");
        System.out.println("(B) My Balance");
        System.out.println("(T) My Transactions");
        System.out.println("(E) Exit");
        System.out.println("********************");

        try (Scanner scanner = new Scanner(System.in)) {
            char option;
            do {
                System.out.print("Select an option: ");
                option = (char) scanner.nextLine().trim().toUpperCase().charAt(0);
                switch (option) {
                    case 'E':
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println(option + " is an invalid option");
                        break;
                }
                System.out.println(System.lineSeparator());
                System.out.println("(A) Show All options");
            } while (option != 'E');

        }
    }

}
