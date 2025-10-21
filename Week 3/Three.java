import java.util.Scanner;
public class Three {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scan.nextDouble();
        double result = num*num*num;
        System.out.printf("Cube of %.2f is: %.2f",num, result);
        scan.close();
    }
}
