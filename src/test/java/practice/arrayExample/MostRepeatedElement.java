package practice.arrayExample;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedElement {
    public static void main(String[] args) {
        int[] givenArray = {1, 2, 3};
        Map<Integer, Integer> map = new HashMap<>();
        int maxRepeatedValue = 0;
        int repeatationCnt = 0;
        for (int i = 0; i < givenArray.length; i++) {
            int currValue = givenArray[i];
            if (map.containsKey(currValue)) {
                int cnt = map.get(currValue);
                map.put(currValue, ++cnt);
            } else {
                map.put(currValue, 1);
            }
            if (repeatationCnt < map.get(currValue)) {
                repeatationCnt = map.get(currValue);
                maxRepeatedValue = currValue;
            }
        }
        System.out.println("Max repeated value: " + maxRepeatedValue + " cnt is " + repeatationCnt);
    }
}
