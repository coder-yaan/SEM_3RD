import java.util.Scanner;
public class Eight {
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            sc.close(); return;
        }
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Array: ");
        printArray(arr, n);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
        } sc.close();
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element!");
        } else {
            System.out.println("Largest Element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
