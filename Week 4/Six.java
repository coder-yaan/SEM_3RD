import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);
        if (!Character.isLetter(ch))
            System.out.println("Invalid input. Please enter an alphabet character.");
        else if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is Vowel");
        else
            System.out.println(ch + " is Consonant");
        scan.close();
    }
}
