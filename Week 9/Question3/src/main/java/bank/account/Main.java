package bank.account;
public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(151, "Lalu", "Champaran, Bihar", 500);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        double si = Account.calculateSimpleInterest(10000, 5, 2);
        double ci = Account.calculateCompoundInterest(10000, 5, 2);
        System.out.printf("Simple Interest = %.2f", si);
        System.out.printf("Compound Interest = %.2f" , ci);
        acc1.details();
    }
}