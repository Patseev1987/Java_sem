//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения
//        исключения, оно должно записаться в лог-файл.


package Sem2.cw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Task3 {
    private static final Logger LOG = MyLogger.log(Task3.class.getName());

    public static String[] getFilesInFolder(String path) {
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if (dir.isDirectory()) {
            files = dir.listFiles();
            if (files != null) {
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    String name = files[i].getName();

                    if (files[i].isFile()) {
                        System.out.println("\tFile - " + name);
                    } else {
                        System.out.println("Directory - " + name);
                    }
                    result[i] = name;
                }

            }

        } else {
            System.out.println(dir.getName() + " is not directory");
        }

        return result;
    }

    public static void write(String path) {
        try (FileWriter in = new FileWriter("NewFile.txt");) {
            String[] data = getFilesInFolder(path);
            for (int i = 0; i < data.length; i++) {
                in.append(data[i]);
            }
            LOG.log(Level.INFO,"aaaaaaaaa");
            throw new IOException("Error");
        } catch (IOException e) {
            LOG.log(Level.INFO, e.getMessage());
            throw new RuntimeException(e);

        }
    }
}


class MyLogger {
    static {
        try (FileInputStream in = new FileInputStream("log.config")) { //полный путь до файла с конфигами
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }
}