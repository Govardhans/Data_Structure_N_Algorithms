package practice.StringsProblems;

/**
 * two strings one character away if they have difference of only one character
 * e.g.
 * abc
 * abdc = there is d character extra
 */

public class OneCharacterAway {
    private int traverseLength;

    public static void main(String[] args) {
        String firstString = "abcde";
        String secondString = "abc";
        boolean result = false;
        if (Math.abs(firstString.length() - secondString.length()) == 1) {

            result = firstString.length() > secondString.length() ?
                    isOneCharacterAway(firstString, secondString)
                    : isOneCharacterAway(secondString, firstString);

        } else if (firstString.length() == secondString.length()) {
            if (firstString.equals(secondString)) {
                System.out.println("Strings are equal");
            } else {
                result = isOneCharacterAwaySameLength(firstString, secondString);
            }

        }

        if (result) {
            System.out.println("Strings are one character Away");
        } else {
            System.out.println("Strings are not one character away");
        }
    }

    private static boolean isOneCharacterAwaySameLength(String firstString, String secondString) {
        int diffCnt = 0;
        for (int i = 0; i < secondString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i + diffCnt)) {
                diffCnt++;
            }
        }
        if (diffCnt > 1)
            return false;
        return true;
    }

    private static boolean isOneCharacterAway(String firstString, String secondString) {

        int traverseLength = firstString.length() < secondString.length() ?
                firstString.length() :
                secondString.length();
        int diffCnt = 0;
        for (int i = 0; i < traverseLength; i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                diffCnt++;
            }
        }
        if (diffCnt > 1)
            return false;
        return true;
    }
}
