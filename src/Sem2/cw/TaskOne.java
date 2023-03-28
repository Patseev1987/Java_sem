package Sem2.cw;

public class TaskOne {
    public static String getLetterCounter(int n) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        String c1 = "c1";
        String c2 = "c2";
        if (n % 2 == 0) {
            sb.append(c1);
            sb.append(c2);
            for (int i = 2; i < n / 2; i++) {
                if (i % 2 == 0) {
                    sb.append(c1);
                } else {
                    sb.append(c2);
                }

            }
            result = sb.toString();
        } else {
            result = "-1";
        }
        return result;
    }
}
