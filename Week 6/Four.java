import java.util.Scanner;
public class Four {
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
        int max = arr[0], min = arr[0];
        for(int i = 1; i < n; i++){
            max = (arr[i] > max)? arr[i] : max;
            min = (arr[i] < min)? arr[i] : min;
        } sc.close();
        System.out.println("Maximum Element: " + max + "\nMinimum Element: " + min);
    }
}

