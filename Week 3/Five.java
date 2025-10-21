import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first point (space separated - x y): ");
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        System.out.print("Enter the second point (space separated - x y): ");
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();
        double distance = Math.sqrt( ( (x1 - x2)*(x1 - x2) ) + ( (y1 - y2)*(y1-y2) ) );
        System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.2f", x1, y1, x2, y2, distance);
        scan.close();
    }
}
