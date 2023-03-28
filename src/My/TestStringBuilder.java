package My;

public class TestStringBuilder {
    public static void main(String[] args) {
        String text = "My text";
        text = text.toUpperCase();
        System.out.println(text);
        String text1 = "Hello";
        String text2 = " my";
        String text3 = " friend!";
        String textAll = text1 + text2 + text3;
        System.out.println(textAll);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" Friend!!!");
        System.out.println(sb.toString());
    }
}
