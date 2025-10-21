import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++)
            sum += i;
        System.out.println("Sum of the series 1 + 2 + ... + " + N + " is: " + sum);
        scan.close();
    }
}
