import bank.Bank;
import bank.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // User details
        User userOne = new User("Jerry","BO10006789");
        userOne.setInitialBalance(5000);

        // Welcome to the BankApp
        Bank bankApp = new Bank(userOne);
        bankApp.runBankApp();

        // Main Menu
        bankApp.menu();

        // Press a key to select an option
        bankApp.pressKey();

    }

}
