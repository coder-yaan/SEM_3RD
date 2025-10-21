package shunya;
import java.util.Scanner;

public class Main {
    //Method for division
    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
    //Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many division operations would you like to perform? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter dividend (numerator): ");
            int dividend = scanner.nextInt();
            System.out.print("Enter divisor (denominator): ");
            int divisor = scanner.nextInt();

            try {
                int result = divideNumbers(dividend, divisor);
                System.out.println("Result: " + dividend + " / " + divisor + " = " + result);

            } catch (ArithmeticException e) {

                System.out.println("Division by zero is not allowed!");
                System.out.println("Please enter a non-zero divisor.");
            }
        }
        scanner.close();
    }
}