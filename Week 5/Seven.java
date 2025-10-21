import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elments (space - separated): ");
        for (int i = 0; i < size; i++) 
            array[i] = scan.nextInt();
        scan.close();
        int largest = array[0];
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
            largest = ( array[i] > largest) ? array[i] : largest;
        }
        System.out.println("\nLargest element: " + largest);
    }
}
