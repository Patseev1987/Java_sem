//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
//        и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.

package Sem2.cw;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static String buildString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TEST".repeat(100));
        return stringBuilder.toString();
        // return "TEST".repeat(100); short form
    }

    public static void MyFileWriter (String arg){
        try(FileWriter in = new FileWriter("MyFile");) {
            in.append(arg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
