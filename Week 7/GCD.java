import java.util.Scanner;
public class GCD {
    public static int gcdRecursive(int a, int b) {
        if (b == 0) return a;
        return gcdRecursive(b, a % b);
    }
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Numbers must be positive integers.");
            scanner.close(); return;
        }
        System.out.println("Choose method:");
        System.out.println("1. Recursive");
        System.out.println("2. Iterative");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        int gcd;
        switch(choice) {
            case 1:
                gcd = gcdRecursive(num1, num2);
                System.out.printf("GCD (recursive) of %d and %d is %d%n", num1, num2, gcd);
                break;
            case 2:
                gcd = gcdIterative(num1, num2);
                System.out.printf("GCD (iterative) of %d and %d is %d%n", num1, num2, gcd);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
