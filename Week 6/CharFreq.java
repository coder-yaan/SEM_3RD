import java.util.HashMap;
import java.util.Scanner;
public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character frequencies:");
        for (char key : freq.keySet()) {
            if (key == ' ')
                System.out.println("Spaces: " + freq.get(key));
            else 
                System.out.println(key + " : " + freq.get(key));
        }
    }
}
