import java.util.Scanner;
public class Ten {
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
        printArray(arr, n); sc.close();
        System.out.print("Reversed Array: ");
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        } printArray(arr, n);
    }
}

