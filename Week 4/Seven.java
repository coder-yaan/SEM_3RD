import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scan.nextDouble();
        System.out.print("Enter fourth number: ");
        double num4 = scan.nextDouble();
        double smallest = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        System.out.printf("The smallest number is: %.2f", smallest);
        scan.close();
    }
}
