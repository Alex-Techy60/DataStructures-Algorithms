import java.util.Scanner;

class Bank {
    private String userName;
    private int balance;
    private int accountNumber;
    private int password;

    // Constructor
    Bank(String userName, int accountNumber, int password, int balance) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for checking balance, 2 for depositing, 3 for withdrawing, 4 for changing password, 5 to exit");
            int command = sc.nextInt();
            if (command == 5) {
                System.out.println("Exiting... Have a great day!");
                break;
            }
            if (!validatePassword(sc)) continue;

            switch (command) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    changePassword(sc);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to validate password
    private boolean validatePassword(Scanner sc) {
        System.out.println("Enter your current password:");
        int enteredPassword = sc.nextInt();
        if (enteredPassword != password) {
            System.out.println("Oops, password is incorrect.");
            return false;
        }
        return true;
    }

    // Method to check balance
    private void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    // Method to deposit money
    private void deposit(Scanner sc) {
        System.out.println("Enter the amount you want to deposit:");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " has been credited to your account.");
            checkBalance();
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    // Method to withdraw money
    private void withdraw(Scanner sc) {
        System.out.println("Enter the amount you want to withdraw:");
        int amount = sc.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " has been debited from your account.");
            checkBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount. Please try again.");
        }
    }

    // Method to change password
    private void changePassword(Scanner sc) {
        System.out.println("Enter your new password:");
        int newPassword = sc.nextInt();
        System.out.println("Re-enter your new password for confirmation:");
        int confirmPassword = sc.nextInt();

        if (newPassword == confirmPassword) {
            password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Passwords do not match. Try again.");
        }
    }
}

public class OOPS {
    public static void main(String[] args) {
        new Bank("Alex", 66664444, 6060, 56000);
    }
}

