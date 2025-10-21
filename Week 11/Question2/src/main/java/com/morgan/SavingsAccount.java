package com.morgan;
public class SavingsAccount implements Account{

    private String accountHolderName, accountNumber;
    private static final double MIN_BALANCE = 1000;
    private double balance;

    SavingsAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; this.balance = balance;
    }
    @Override
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount"); return;
        }
        this.balance += amount;
        System.out.println("Deposited " + amount + " to SavingsAccount. New balance: " + balance);
    }
    @Override
    public void withdraw(double amount){
        if ( (balance - amount) >= MIN_BALANCE && amount > 0 ){
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + " from SavingsAccount. New balance: " + balance);
        }
        else System.out.println("Invalid amount");
    }
    @Override
    public void takeLoan(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid loan amount."); return;
        }
        System.out.println("Loan approved for " + accountHolderName + " (SavingsAccount): " + amount);
    }
    public void displayInfo(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Minimum Balance: " + MIN_BALANCE);
    }
}