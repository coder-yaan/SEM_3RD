import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! n must be >= 1.");
        } else {
            int first = 0, second = 1;
            for (int i = 1; i <= n; i++) {
                int next = first + second;
                System.out.print(first + " ");
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}

