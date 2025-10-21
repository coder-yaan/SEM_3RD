package bank.account;
class SavingsAccount extends Account {
    private final double minBalance = 1000;
    public SavingsAccount(int id, String accountHolderName, String address, double balance) {
        super(id, accountHolderName, address, balance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited in Savings Account. Balance = " + balance);
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Savings Account. Balance = " + balance);
        } else {
            System.out.println("Cannot withdraw! Minimum balance requirement not met.");
        }
    }
    public void display() {
        showDetails();
        System.out.println("Minimum Balance: " + minBalance);
    }
}