package practice.sortingAlgorithm;

import java.util.Arrays;

/**
 * o(n2) quadratic
 * in-place algorithm
 * stable
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, -7, 3, -1, 2, 1, 7};
        System.out.println("Sorted Array : " + Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        //sorted array (left most element)
        //unsorted array (remaining elements)

        //compare each element in unsorted array to sorted array and place it at
        //appropriate position

        //sorted array array[0] index =0
        //unsorted array array[arraylength - index] to end

        // foreach array elements in unsorted array compare with sorted

        if (array.length == 1) {
            return array;
        }

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i]=newElement;
        }
        return array;
    }
}
