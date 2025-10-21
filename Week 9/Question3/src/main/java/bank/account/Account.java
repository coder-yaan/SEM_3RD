package bank.account;
public class Account {
    private int id;
    private String accountHolderName, address;
    private double balance;
    public Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited! New Balance = " + balance);
        } else
            System.out.println("Invalid deposit amount.");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn! New Balance = " + balance);
        } else
            System.out.println("Insufficient balance or invalid amount.");
    }
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100.0), time) - 1);
    }
    public void details(){
        System.out.println("Id: " + id);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}
