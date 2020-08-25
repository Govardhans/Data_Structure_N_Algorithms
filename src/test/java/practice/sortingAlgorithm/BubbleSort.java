package practice.sortingAlgorithm;

import java.util.Arrays;

/**
 * O(n2) quadratic time complexity
 * Its a stable algorithm as duplicate elements relative position doesn't swap
 * swap operation takes extra processing
 * extra memory space is require for swap element
 *
 * <p>Two array elements are compared and swap if first is greater than second (ascending order)</p>
 *
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 4, -7, 3, -1, 2, 1, 7};
        System.out.println("Sorted Array : " + Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        int length = array.length;
        int sortedPartition = length;
        int temp = 0;
        while (sortedPartition > 0) {
            for (int i = 0; i < sortedPartition - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i+1);
                }
            }
            sortedPartition--;
        }
        return array;

    }

    private static void swap(int[] array, int firstPosition, int secondPosition) {
        if(array[firstPosition] == array[secondPosition]){
            return;
        }
        int temp;
        temp = array[firstPosition];
        array[firstPosition] = array[secondPosition];
        array[secondPosition] = temp;
    }
}
