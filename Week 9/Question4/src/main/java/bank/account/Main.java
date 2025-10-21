package bank.account;
public class Main {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(101, "Hamzah",
                "Aligarh", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.showDetails();
    }
}