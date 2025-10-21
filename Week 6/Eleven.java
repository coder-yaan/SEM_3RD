import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.nextLine();
        scan.close();
        int totalUniqueChar = 0;
        int totalChar = 0;
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++){
            if(freq[i] != 0){
                totalUniqueChar++;
                totalChar += freq[i];
                if ( (char)i == ' '){
                    System.out.println("Spaces: " + freq[i]);
                } else {
                    System.out.println((char)i + ": " + freq[i]);
                }
            }
        }
        System.out.println("Total unique characters: " + totalUniqueChar);
        System.out.println("Total characters: " + totalChar);
    }
}
