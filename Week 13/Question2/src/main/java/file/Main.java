package file;
import java.io.IOException;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test.txt", true)) {
            fw.write("Hello World.");
            System.out.print("File has been written successfully.");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}