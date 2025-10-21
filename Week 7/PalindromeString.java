import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine(); scanner.close();
        if (str.equals("")) {
            System.out.println("String is empty."); return;
        }
        int len = str.length();
        String original = str.toLowerCase();
        boolean isPalindrome = true;
        for(int i = 0; i < len/2; i++){
            if(original.charAt(i) != original.charAt(len-1-i))
                isPalindrome = false; break;
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome!");
        } else 
            System.out.println("The string is NOT a palindrome.");
    }
}
