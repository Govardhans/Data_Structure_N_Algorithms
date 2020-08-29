package practice.sortingAlgorithm;

import java.util.Arrays;

public class InsertionSortRecurssive {
    public static void main(String[] args) {
        int[] array = {5, 4, -7, 3, -1, 2, 1, 7};
        System.out.println("Sorted Array : " + Arrays.toString(insertionSort(array)));
        int[] array2 = {5, 4, -7, 3, -1, 2, 1, 7};
        System.out.println("recursive Array : " + Arrays.toString(insertionSort(array2, array.length)));
    }

    public static int[] insertionSort(int[] array, int numItems) {
        if (numItems < 2) {
            return array;
        }
        insertionSort(array, numItems - 1);

        int newElement = array[numItems - 1];
        int i;
        for (i = numItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            System.out.println("----------------------------");
            System.out.println(Arrays.toString(array));
            System.out.println("i value : [" + array[i] + "] i-1 value [" + array[i - 1] + "]");
            array[i] = array[i - 1];
        }
        array[i] = newElement;
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] insertionSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length;
             firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        return array;
    }
}
