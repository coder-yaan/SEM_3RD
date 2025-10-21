package bank.account;
abstract class Account {
    protected int id;
    protected String accountHolderName, address;
    protected double balance;
    public Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void showDetails() {
        System.out.println("Account ID: " + id);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}