package practice.StringsProblems;

public class RemoveNthCharFromString {
    //string
    //nth character means n-1 in string

    public static void main(String[] args) {
        String string = "String";
        System.out.println("After removing char: " + removeCharacterFrom(string, 5));
        System.out.println("After removing char: " + secondImplementation(string, 7));
    }

    private static String removeCharacterFrom(String string, int charAt) {
        char[] charArray = string.toCharArray();
        for (int i = charAt - 1; i < charArray.length - 1; i++) {
            charArray[i] = charArray[i + 1];
        }
        charArray[charArray.length - 1] = ' ';
        return new String(charArray).trim();
    }

    public static String secondImplementation(String str, int n) {
        if (n > str.length()) {
            return "Invalid index";
        }
        return str.substring(0, n - 1) + str.substring(n);
    }
}
