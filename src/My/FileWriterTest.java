package My;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.*;
import java.util.logging.Logger;


public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("newTestFile.txt");
        FileWriter writer = new FileWriter(file);
        writer.append("aaaaaaa",1,4);
        writer.close();
        Logger logger = Logger.getLogger("q");
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
    }
}
