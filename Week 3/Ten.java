import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference of the circle with radius %.2f is: %.2f\n", radius, circumference);
        scan.close();
    }
}
