package Sem1.cw;
import java.util.*;
public class Task3 {

    static int runNow(int[] arr) {
        int count1 = 0;
        int result1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            }
            if (result1 < count1) {
                result1 = count1;
            }
            if (arr[i] != 1) {
                count1 = 0;
            }
        }
        return result1;
    }
    public static void run() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = r.nextInt(2);
        }
        int count = 0;
        int result = 0;
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < size; i++) {
            if (newArray[i] == 1) {
                count++;
            }
            if (result < count) {
                result = count;
            }
            if (newArray[i] != 1) {
                count = 0;
            }
        }
        System.out.println(result);
    }
}