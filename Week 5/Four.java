import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scan.nextInt();
        scan.close();
        double sum = 0.0;
        for(int i = 1; i <= n; i++)
            sum += 1.0/i;
        System.out.printf("Sum of series: %.4f", sum);
    }
}
