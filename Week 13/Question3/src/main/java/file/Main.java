package file;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("QuotesFromGoogle.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("ChairManSpeech.txt", true));
            String line;
            while ((line = br.readLine() )!= null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            br.close();
        } catch ( IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
