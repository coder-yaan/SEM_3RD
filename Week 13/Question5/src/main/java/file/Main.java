package file;
import java.io.*;
public class Main {
    public static void main() {
        int lineCount = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("Quotes.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
            }
            br.close();
            System.out.println("Total lines in file: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
