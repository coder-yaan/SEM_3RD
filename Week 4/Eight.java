import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scan.nextInt();
        int sum = 0;
        for (int i = 2; i <= N; i += 2)
            sum += i;
        System.out.println("Sum of all even numbers from 1 to " + N + " is: " + sum);
        scan.close();
    }
}
