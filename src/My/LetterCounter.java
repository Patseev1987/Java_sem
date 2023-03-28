package My;

public class LetterCounter {
    public static String getLetterCounter(String text) {
        char[] charArray = new char[text.length()];
        text.getChars(0, text.length(), charArray, 0);
        char findLetter = charArray[0];
        int count = 1;
        String result = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < text.length(); i++) {
            if (findLetter == charArray[i]) {
                count++;
            } else {
                if (count==1){
                }
                sb.append(findLetter);
                sb.append(count);
                findLetter = charArray[i];
                count = 1;
            }
        }
        if (charArray[text.length()-1] == charArray[text.length() - 2]) {
            sb.append(findLetter);
            sb.append(count);
        }else{
            sb.append(charArray[text.length()-1]);

        }
        result = sb.toString();
        return result;
    }
}
