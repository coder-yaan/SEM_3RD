import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        scan.close();
        long fact = 1;
        for (int i = 1; i <= n; i++) 
            fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
