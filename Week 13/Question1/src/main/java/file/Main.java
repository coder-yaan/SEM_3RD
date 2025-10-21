package file;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("TestFile.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println( (isFileCreated) ? "File Created." : "File Not Created." );

    }
}
