package practice.StringsProblems;

import java.util.*;

public class NonRepeatingCharacter {
    //aabcc = b
    //ccdd = null
    //abc =a

    public static void main(String[] args) {
        String str = "aabbcceE";
        char[] chars = str.toCharArray();
        char nonRepeatingCharacter;
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : chars) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        boolean charFound = false;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue()==1){
                System.out.println("Non repeating character :: "+ entry.getKey());
                charFound = true;
                break;
            }
        }
        if(!charFound){
            System.out.println("Non repeating character :: NULL");
        }
    }
}
