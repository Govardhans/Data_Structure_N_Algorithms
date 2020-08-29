package practice.stacks;

import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        String str = "was it a car or a cat I saw?";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        LinkedList<Character> list = new LinkedList<>();
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') ||
                    (chars[i] >= 'A' && chars[i] <= 'Z')) {
                list.push(chars[i]);
            }
        }

        for(int j = 0, k= list.size()-1; j < list.size() && k >j; j++, k--){
                if(list.get(j) != list.get(k)){
                    return false;
                }
        }

        return true;
    }
}
