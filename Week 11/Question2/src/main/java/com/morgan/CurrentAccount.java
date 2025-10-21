package com.morgan;
public class CurrentAccount implements Account {
    
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private static final double OVERDRAFT_LIMIT = 1000;

    public CurrentAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid deposit amount"); return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to CurrentAccount. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdraw amount"); return;
        }
        if(balance - amount >= -OVERDRAFT_LIMIT){
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from CurrentAccount. New balance: " + balance);
        }else {
            System.out.println("Withdrawal exceeds overdraft limit. Transaction denied.");
        }
    }
    public void displayInfo(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + OVERDRAFT_LIMIT);
    }
}