package practice.paypay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringChallenge {
    public static void main(String[] args) {
        String str = "5;1,1,2,0,3";
        String[] split = str.split(";");
        int n = Integer.parseInt(split[0]);
        String[] numbersArray = split[1].split(",");
        System.out.println(n);
        List<String> numbers = new ArrayList<>();
        for (String str2 : numbersArray) {
            System.out.print(str2 + " ");
        }
        String result = null;
        for (String str2 : numbersArray) {
            if (numbers.contains(str2)) {
                result = str2;
                break;
            }
            numbers.add(str2);
        }
        System.out.println("Repeated number is : " + result);
    }
}
