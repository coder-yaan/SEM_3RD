package file;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileReader fr = new FileReader("Quotes.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                count++;
            }
            fr.close();
            System.out.println("Total characters in file: " + count);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}