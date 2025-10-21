import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        scan.close();
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;            
            temp /= 10;      
        }
        System.out.println("Sum of digits of " + num + " = " + sum);
    }
}
