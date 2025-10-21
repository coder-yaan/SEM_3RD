package com.bank;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter opening balance: ");
        int openingBalance = input.nextInt();
        System.out.print("Please enter the amount you want to withdraw: ");
        int amount = input.nextInt();
        Account acc = new Account(openingBalance);
        try {
            acc.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Occurred: " + e.getMessage());
        }
    }
}