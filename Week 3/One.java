import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        double result = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f \n\n", num1, num2, result);
        scan.close();
    }
}

