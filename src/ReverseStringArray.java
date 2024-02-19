import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseStringArray {

    public static void reverseString(char[] chars){
        int size = chars.length;
        char[] reverseChar = new char[size];
        for (int i = size-1; i>=0;i--){
            int index = (size -1) - i;
            reverseChar[index] = chars[i];
        }
        char openCurly = '[', closeCurly = ']';
        System.out.print(openCurly);
        for (int i = 0; i < reverseChar.length; i++) {
            if (i == reverseChar.length-1){
                System.out.print("\""+reverseChar[i]+ "\"");
            }else {
                System.out.print("\""+reverseChar[i]+ "\""+",");
            }
        }
        System.out.print( closeCurly);
    }

    public static void main(String[] args) {
        char[] chars = new char[] {'h','e','l','l','o'};//{'H','a','n','n','a','h'};//
        reverseString(chars);
        reverseStringBySwap(chars);
    }
    public static void reverseStringBySwap(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move start index forward and end index backward
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
}
