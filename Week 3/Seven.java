import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = scan.nextDouble();
        double area = length*breadth;
        System.out.printf("Area of rectangle is : %.2f", area);
        scan.close();
    }
}
