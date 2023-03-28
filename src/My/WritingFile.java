package My;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        PrintWriter pw= new PrintWriter(file);
        pw.println("Test row 1");
        pw.println("Test row 2");
        pw.checkError();
    }
}
