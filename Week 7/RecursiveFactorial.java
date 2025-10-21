import java.util.Scanner;
public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(n);
            System.out.printf("%d! = %d%n", n, result);
        }
        scanner.close();
    }
}
