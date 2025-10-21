import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scan.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scan.nextInt();
        System.out.printf("Before swapping: a = %d, b = %d\n", a, b);
        int temp = a; a = b; b = temp;
        System.out.printf("After swapping:  a = %d, b = %d\n", a, b);
        scan.close();
    }
}

