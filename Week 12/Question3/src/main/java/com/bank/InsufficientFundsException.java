package com.bank;
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() { super("Insufficient Funds!"); }
}