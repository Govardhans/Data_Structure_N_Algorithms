package practice.sortingAlgorithm;

import java.util.Arrays;

public class AlgoPractice {
    public static void main(String[] args) {
        int[] array = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Bubble Sort : " + Arrays.toString(bubbleSort(array)));
        int[] array2 = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Selection Sort : " + Arrays.toString(selectionSort(array2)));
        int[] array3 = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Insertion Sort : " + Arrays.toString(insertionSort(array3)));
    }

    private static int[] insertionSort(int[] array) {
        for (int unsortedIndex = 1; unsortedIndex < array.length; unsortedIndex++) {
            int newElement = array[unsortedIndex];
            int i;
            for (i = unsortedIndex; i > 0 && newElement < array[i-1]; i--){
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
        return array;
    }

    private static int[] selectionSort(int[] array) {
        for (int sortedIndex = array.length - 1; sortedIndex > 0; sortedIndex--) {
            int max = 0;
            for (int i = 1; i < sortedIndex; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            if (array[max] > array[sortedIndex]) {
                swap(array, max, sortedIndex);
            }
        }
        return array;
    }

    private static int[] bubbleSort(int[] array) {
        int sortedIndex = array.length - 1;
        while (sortedIndex > 0) {
            for (int i = 0; i < sortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            sortedIndex--;
        }
        return array;
    }


    private static void swap(int[] array, int firstIndex, int secondIndex) {
        if (array[firstIndex] == array[secondIndex]) {
            return;
        }

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
