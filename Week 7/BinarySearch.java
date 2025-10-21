import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void binarySearch(int[] arr, int key){
        int idx = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                idx = mid; break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        if (idx != -1) {
            System.out.printf("Value %d found at index %d or position %d.", key, idx, (idx +1));
        } else
            System.out.printf("Value %d is not present in array!", key);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Array size must be greater than 0");
            scanner.close(); return;
        }
        int[] arr = new int[size];
        System.out.printf("Enter %d elements (extra values will be ignored): ", size);
        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.print("Enter value to search: ");
        scanner.nextLine();
        int key = scanner.nextInt();
        binarySearch(arr, key);
        scanner.close();
    }
}