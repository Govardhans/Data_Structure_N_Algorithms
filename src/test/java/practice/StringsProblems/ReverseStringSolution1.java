package practice.StringsProblems;

public class ReverseStringSolution1 {
    public static void main(String[] args) {
        String givenString = "abc ";
        String reverseString = reverseString(givenString);
        System.out.println("Reverse of [" + givenString + "] is [" + reverseString + "]");
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
