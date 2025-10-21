import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine(); scanner.close();
        if (original.equals("")) {
            System.out.println("Nothing to reverse."); return;
        }
        if (original.length() == 1) {
            System.out.println("Reversed string: " + original); return;
        } 
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) 
            reversed = reversed + original.charAt(i);
        System.out.println("Reversed string: " + reversed);
    }
}