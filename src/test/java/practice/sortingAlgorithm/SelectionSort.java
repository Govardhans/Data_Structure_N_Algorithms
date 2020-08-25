package practice.sortingAlgorithm;

import java.util.Arrays;

/**
 * In place algorithm - no extra memory space required to sort the elements
 * o(n2) - quadratic time complexity
 * doesn't require much swapping as bubble sort
 * Unstable algorithm - relative position of duplicate elements may changes
 * <p> we divide array into two parts. Sorted and unsorted. <br>
 * compare first unsorted element with rest in unsorted group<br>
 * then compare the largest element from first group with sorted group
 * swap if require</p>
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Sorted Array : " + Arrays.toString(selectionSort(array)));
    }

    private static int[] selectionSort(int[] array) {
        int largest = 0;
        for (int unSortedIndex = array.length - 1; unSortedIndex > 0; unSortedIndex--) {
            largest = 0;
            for (int i = 1; i <= unSortedIndex; i++) {
                if(array[largest] < array[i]){
                    largest = i;
                }
            }
            if(array[largest] > array[unSortedIndex]) {
                swap(array, largest, unSortedIndex );
            }
        }
        return array;
    }


    private static void swap(int[] array, int first, int second) {
        if (array[first] == array[second]) {
            return;
        }
        if (array[first] > array[second]) {
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;
            System.out.println("after swap : " + Arrays.toString(array));
        }
    }
}
