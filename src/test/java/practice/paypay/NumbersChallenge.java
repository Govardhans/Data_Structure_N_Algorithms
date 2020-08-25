package practice.paypay;

import java.util.ArrayList;
import java.util.List;

public class NumbersChallenge {

    // -1 0 1 2 3 4 5  [-1, 2, 5]
    // -1+-1 = 2 + 2 + (5-2) = 7
    //5 4 3 2 3 4 5 6  [5, 2, 6]
    // 5- 2+1 + 4 = 8

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -2;
        int num3 = 6;
        List<Integer> resultList = new ArrayList<>();
        getResult(num1, num2, resultList);
        getResult(num2, num3, resultList);
        resultList.add(num3);
        System.out.println(resultList.toString());
    }

    private static void getResult(int num1, int num2, List<Integer> resultList) {
        if (num1 < num2) {
            while(num1 < num2){
                resultList.add(num1);
                num1++;
            }
        } else if (num1 > num2) {
            while(num1 > num2){
                resultList.add(num1);
                num1--;
            }
        }
    }

}
