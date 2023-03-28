package My;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
    //String sep = File.separator;
//String path =sep+"Users"+sep+"bogdanpatseev"+sep+"Desktop"+sep+"test.txt";
//        File file = new File(path);
        File file = new File("text");
        Scanner sc = new Scanner(file);
        String[] myString = new String[7];
        int count = 0;
        while (sc.hasNextLine()) {
            myString[count] = sc.nextLine();
            System.out.println(myString[count]);
            count++;
        }
        sc.close();
//        System.out.println(Arrays.toString(myString));
    }
}
