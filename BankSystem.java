/* 
Task:

Create a Java program that simulates a simple banking system. The program should have the following features:

- A BankAccount class with the following attributes:
    - accountNumber (integer)
    - accountHolder (string)
    - balance (double)
- A constructor that initializes the accountNumber, accountHolder, and balance attributes.
- An array of BankAccount objects to store multiple accounts.
- Methods to:
    - Deposit money into an account
    - Withdraw money from an account
    - Display account details

Requirements:

- Create a BankAccount class with the specified attributes and constructor.
- Create an array of BankAccount objects with a size of 5.
- Initialize the array with 5 different accounts using the constructor.
- Implement the deposit, withdrawal, and display account details methods.
- Test the program by depositing and withdrawing money from different accounts, and displaying account details.

Example Output:
Account 1:
Account Number: 1234
Account Holder: John Doe
Balance: 1000.0

Deposit $500 into Account 1:
Account 1:
Account Number: 1234
Account Holder: John Doe
Balance: 1500.0

Withdraw $200 from Account 1:
Account 1:
Account Number: 1234
Account Holder: John Doe
Balance: 1300.0 
*/

public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(1234, "Sasi", 1000.0);
        accounts[1] = new BankAccount(2345, "Surya", 1500.0);
        accounts[2] = new BankAccount(3456, "Aamai", 2000.0);
        accounts[3] = new BankAccount(4567, "Sathish", 1200.0);
        accounts[4] = new BankAccount(5678, "Suganth", 1800.0);
        System.out.println("Initial Account Details:");
        System.out.println("\nDeposit ₹500 into Account 1:");
        accounts[0].deposit(500.0);
        accounts[0].displayAccountDetails();
        System.out.println("\nWithdraw ₹200 from Account 1:");
        accounts[0].withdraw(200.0);
        accounts[0].displayAccountDetails();
    }
}

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance:₹" + balance);
    }
}
