
public class UniqueCharacter {

    public static int indexOfChar(String s){
        int[] frequency = new int[26];

        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(  indexOfChar(s));
    }
}
