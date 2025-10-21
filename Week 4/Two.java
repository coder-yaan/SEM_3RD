import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scan.nextDouble();
        double largest = Math.max(Math.max(num1, num2), num3);
        System.out.println("The largest number is: " + largest);
        scan.close();
    }
}
