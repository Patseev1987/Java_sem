package Sem1.cw;

public class Task3_new {
    // 1 1 0 1 1 1
    public static void run(int [] array) {
        int count = 0;
        int result = 0;
        for (int x: array ) {
            if (x==1) count++;
            if (count>result) result=count;
            if (x!=1) count=0;
        }
        System.out.println(result);
    }
}
