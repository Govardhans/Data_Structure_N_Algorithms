package practice.StringsProblems;

public class Palindrome {

    public static void main(String[] args) {
        int num = 123454321;
        System.out.println("Original nUmber : "+ num);
        if(isPalindrome(num)) System.out.println("Number is palindrome");;
    }

    //121 123321
    public static boolean isPalindrome(int num){
        int temp = num;
        int reverseNum=0;
        while(temp/10 !=0){
            reverseNum = (reverseNum *10) + (temp%10) ;
            temp = temp/10;
        }
        reverseNum = (reverseNum*10) + (temp);
        System.out.println("Reversed number : "+ reverseNum);
        return reverseNum == num;
    }

    public static void isPalindrome(String str) {

    }
}
