import java.util.Scanner;
public class Three {
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
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
        sc.close();
        System.out.print("Original Array: ");
        printArray(arr, n);
        if (n == 1) {
            System.out.println("Only one element, no swap needed.");
        } else {
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
            System.out.print("Array after swapping: ");
            printArray(arr, n);
        }
    }
}

