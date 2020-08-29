package practice.StringsProblems;

/**
 * Remove all occurrence
 */
public class RemoveAllOccurrences {
    public static void main(String[] args) {
        String str = "aaabbb";
        char removeChar = 'a';
        int indexOfChar = str.indexOf(removeChar);
        System.out.println(str.substring(0, indexOfChar) +
                str.substring(indexOfChar + 1, str.length()));

        System.out.println("String after removing " + removeChar + " : " +
                removeCharacter(str, removeChar));
    }

    private static String removeCharacter(String str, char removeChar) {
        if (str.indexOf(removeChar) == -1) {
            return str;
        }
        int indexOfChar = str.indexOf(removeChar);
        return removeCharacter(
                str.substring(0, indexOfChar) + str.substring(indexOfChar + 1, str.length()),
                removeChar);
    }
}
