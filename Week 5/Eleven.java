import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of total number of rows (must be odd): ");
        int h = sc.nextInt();
        if ( h%2 == 0 ){
            System.out.println("Total number of rows must be odd!");
            sc.close(); return;
        }
        int mid = (h + 1) / 2;
        for (int i = 1; i <= h; i++) {
            int stars = (i <= mid) ? i : h - i + 1;
            int spaces = mid - stars;
            for (int j = 1; j <= spaces; j++)
                System.out.print(" ");
            for (int j = 1; j <= stars; j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
