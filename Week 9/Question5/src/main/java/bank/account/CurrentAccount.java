package bank.account;
class CurrentAccount extends Account {
    private final double maxWithdrawalLimit = 500000;
    public CurrentAccount(int id, String accountHolderName, String address, double balance) {
        super(id, accountHolderName, address, balance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited in Current Account. Balance = " + balance);
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= maxWithdrawalLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Current Account. Balance = " + balance);
        } else {
            System.out.println("Cannot withdraw! Insufficient Balance or Exceeds max withdrawal limit.");
        }
    }
    public void display() {
        showDetails();
        System.out.println("Maximum Withdrawal Limit: " + maxWithdrawalLimit);
    }
}