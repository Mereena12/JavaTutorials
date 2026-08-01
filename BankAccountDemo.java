package practice;

import java.util.Scanner;

class BankAccount {
 
    int accountNumber;
    String accountHolder;
    double balance;

   
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    
    void displayDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, holder, balance);

     
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

     
        account.displayDetails();

        sc.close();
    }
}