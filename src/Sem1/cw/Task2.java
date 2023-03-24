package Sem1.cw;

import java.util.*;

public class Task2 {

    public static void run() {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = r.nextInt(5);
        }

        System.out.println(Arrays.toString(newArray));

        System.out.println("Enter the number for search in array: ");
        int search = sc.nextInt();
        int last = newArray.length - 1;
        int temp = 0;
        for (int i = 0; i <= last; i++) {
            if (newArray[i] == search) {
                for (int j = last; j > i; j--) {
                    if (newArray[j] != search) {
                        temp = newArray[i];
                        newArray[i] = newArray[j];
                        newArray[j] = temp;
                    }
                }
                last--;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}