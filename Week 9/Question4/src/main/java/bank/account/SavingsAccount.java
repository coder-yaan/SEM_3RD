package bank.account;
class SavingsAccount extends Account {
    public SavingsAccount(int id, String accountHolderName, String address, double balance) {
        super(id, accountHolderName, address, balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. Balance = " + balance);
        } else
            System.out.println("Invalid deposit amount.");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Balance = " + balance);
        } else
            System.out.println("Insufficient balance or invalid amount.");
    }
}
