import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        double result = num1 * num2;
        System.out.printf("Multiplication result of %.2f and %.2f is: %.2f", num1, num2, result);
        scan.close();
    }
}
