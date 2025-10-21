import java.util.Scanner;
public class Fibonacci {
    public static long fibRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
    public static void fibIterative(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Number must be non-negative.");
            scanner.close(); return;
        }
        System.out.println("Choose method:");
        System.out.println("1. Recursive");
        System.out.println("2. Iterative");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt(); scanner.close();
        switch(choice) {
            case 1:
                System.out.print("Fibonacci series (recursive): ");
                for (int i = 0; i < n; i++) 
                    System.out.print(fibRecursive(i) + " ");
                break;
            case 2:
                System.out.print("Fibonacci series (iterative): ");
                fibIterative(n);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

