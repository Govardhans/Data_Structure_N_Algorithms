package practice.sortingAlgorithm;

import java.util.Arrays;

/**
 * this sorting method is perfect when you know the range of array element
 * basically range should be near to count of input array
 * this algorithm is useful when integers are being sorted
 */
public class CountingSort {
    public static void main(String[] args) {
//        int[] array = {9, 8, 6, 2, 4, 10, 0, 1, 5, 7, 5};
        int[] array = {4, 4, 4, 4, 4};
//        System.out.println(Arrays.toString(countingSort(array)));
        System.out.println(Arrays.toString(countingSort(array, 4, 4)));
    }

    // 4 4 2 1 0
    // 0 1 1 0 2
    // o(n) time complexity o(logn)

    private static int[] countingSort(int[] array, int min, int max) {
        // 4 4 2 3
        // min 2 max 4 (4 - min)
        // number of ele = 4 - 2 +1 = 3
        int[] countArray = new int[max - min + 1];
        // 0 1 2
        // 1 1 2
        // index+min = 0+2
        //1+2
        //2+2
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            countArray[element - min]++;
        }
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            int element = countArray[i];
            while (element > 0) {
                array[index] = i + min;
                index++;
                element--;
            }
        }
        // 2 3 4 4
        return array;
    }

    private static int[] countingSort(int[] array) {
        System.out.println("Original Array  : " + Arrays.toString(array));
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            tempArray[index] = tempArray[index] + 1;
            System.out.println("After iteration " + i + " " + Arrays.toString(tempArray));
        }
        int cnt = 0;
        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            cnt = tempArray[i];
            if (cnt == 0) continue;

            while (cnt > 0) {
                array[index] = i;
                index++;
                cnt--;
            }
        }
        return array;
    }
}
