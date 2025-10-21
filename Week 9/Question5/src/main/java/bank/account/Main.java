package bank.account;
public class Main {
    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount(101, "Jhingur", "Aligarh", 5000);
        sAcc.display();
        sAcc.deposit(2000);
        sAcc.withdraw(6000);
        sAcc.withdraw(3000);
        System.out.println();
        CurrentAccount cAcc = new CurrentAccount(102, "Chidiya", "Delhi", 350000);
        cAcc.display();
        cAcc.deposit(200000);
        cAcc.withdraw(515000);
        cAcc.withdraw(115600);
    }
}
