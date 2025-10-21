import java.util.Arrays;
import java.util.Scanner;
public class Sorting {
    public static void insertionSort(int[] arr) {
        if(arr.length < 2) return;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i], j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        if(size < 1) {
            System.out.println("Array size must be greater than 1");
            scanner.close(); return;
        }
        int[] arr = new int[size];
        System.out.printf("Enter %d elements (extra values will be ignored): ", size);
        for (int i = 0; i < size; i++) 
            arr[i] = scanner.nextInt();
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}