import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number (dividend): ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number (divisor): ");
        int num2 = scan.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        scan.close();
    }
}
