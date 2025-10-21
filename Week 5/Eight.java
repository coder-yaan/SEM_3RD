import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        scan.close();
        int reversed = 0, temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
