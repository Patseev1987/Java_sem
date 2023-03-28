package My;

public class Palindrome {
    public static boolean getPalindrome (String text){
        char[] charArray = new char[text.length()];
        text.getChars(0, text.length(), charArray, 0);
        int count =0;
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i]==charArray[(charArray.length-1)-i]){
                count++;
            }

        }
        if (count==charArray.length/2){
            return true;
        } else {
            return false;
        }
    }
}
