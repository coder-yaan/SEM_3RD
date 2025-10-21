import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int reversed = 0, temp = num;
        while (temp != 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        if (num == reversed)
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");
    }
}
