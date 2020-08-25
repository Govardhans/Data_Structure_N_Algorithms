package practice.sortingAlgorithm;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Bubble Sort : "
                + Arrays.toString(quickSort(array, 0, array.length)));
    }

    private static int[] quickSort(int[] array, int start, int end) {

        if (end - start < 2) {
            return array;
        }

        int partitionIndex = partition(array, start, end);
        quickSort(array, start, partitionIndex);
        quickSort(array, partitionIndex+1, end);

        return array;
    }

    //{8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];

        int i = start;
        int j = end;
        while (i < j) {

            //empty loop
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }

            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

}
