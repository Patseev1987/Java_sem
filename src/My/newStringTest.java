package My;

public class newStringTest {
    public static String getNewStringTest() {
        String text = "TEST";
String result="";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(text);
        }

        return result=sb.toString();

    }
}
