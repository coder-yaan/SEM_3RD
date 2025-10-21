package com.bank;
public class Account {
    double balance;
    public Account(double balance){ this.balance = balance; }
    public void withdraw(int amount) throws InsufficientFundsException {
        if(amount > balance) throw new InsufficientFundsException();
        else balance -= amount;
    }
}
