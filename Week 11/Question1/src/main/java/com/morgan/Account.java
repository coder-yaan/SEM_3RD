package com.morgan;
public interface Account {
    String bankName = "Lalu Varshney Bank";
    void  deposit(double amount);
    void withdraw(double amount);
    static void aboutBank(){
        System.out.println("Bank Name: " + bankName);
    }
}
