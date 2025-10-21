package com.morgan;
public class Main {
    public static void main(String[] args) {

        Account.aboutBank();
        System.out.println();

        SavingsAccount sa = new SavingsAccount("Bhanu Varhsney", "SA515", 5000);
        sa.displayInfo();
        sa.deposit(2000);
        sa.withdraw(4000);
        sa.withdraw(3000);
        sa.takeLoan(15000);

        System.out.println("----------");

        CurrentAccount ca = new CurrentAccount("Chandu", "CA562", 2000);
        ca.displayInfo();
        ca.deposit(500);
        ca.withdraw(2500);
        ca.withdraw(2000);
    }
}