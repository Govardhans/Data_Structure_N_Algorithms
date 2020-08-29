package practice.StringsProblems;

import java.util.HashSet;
import java.util.Set;

public class PangramString {
//    A pangram is a string that contains all the letters of the English alphabet.
//    An example of a pangram is "The quick brown fox jumps over the lazy dog".
//    A program that checks if a string is pangram or not is given as follows.

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("String: " + str);
        System.out.println(isPangram(str));
//        System.out.println('C' - 'A');
    }

    private static boolean isPangram(String str) {
        char[] charsArray = str.toCharArray();
        Set<Integer> charSet = new HashSet<>();
        for (int i = 0; i < charsArray.length; i++) {
            char c = charsArray[i];
            if (c >= 'A' && c <= 'Z') {
                charSet.add(c - 'A');
            } else if (c >= 'a' && c <= 'z') {
                charSet.add(c - 'a');
            }
        }
        System.out.println(charSet.toString());
        if (charSet.size() != 26) {
//            sum = (n(n+1)/2)
            int expSum = (25 * (25 + 1) / 2);
            int actSum = 0;
            for (Integer num : charSet) {
                actSum += num;
            }
            char missingchar = (char) ((char) 'A' + expSum - actSum);
            System.out.println("missing character " + missingchar + "/" + Character.toString(missingchar).toLowerCase());
            return false;
        }
        return true;
    }
}
