import java.util.Scanner;
public class Six {
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size! Array size must be at least 1.");
            sc.close(); return;
        }
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        System.out.print("Original Array: ");
        printArray(arr, n);
        System.out.print("Enter key to search in array: ");
        int key = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                flag = true; break;
            }
        } sc.close();
        if(!flag)
            System.out.println("Element not present in array.");
    }
}