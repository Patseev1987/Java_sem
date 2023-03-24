package Sem1.cw;

import java.util.Scanner;
import java.time.*;

public class Task1 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Hello Bogdan and " + name);
        System.out.println();
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        System.out.println(hour);
        String text = "";
        if (hour >= 5 & hour < 12) {
            text = "Доброе утро";
        } else if (hour >= 12 & hour < 18) {
            text = "Добрый день";
        } else if (hour >= 18 & hour < 23) {
            text = "Добрый вечер";
        } else if (hour == 23 || hour < 5) {
            text = "Доброй ночи";
        }
        System.out.println(text + "  " + name);
    }
}
