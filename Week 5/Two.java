import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter elements (space - separated): ");
        for (int i = 0; i < size; i++)
            array[i] = scan.nextInt();
        int sum = 0;
        System.out.print("Array: ");
        for (int i = 0; i < size; i++){
            sum += array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("\nSum of all elements: " + sum);
        scan.close();
    }
}
