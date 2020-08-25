package practice.sortingAlgorithm;

import java.util.Arrays;

enum Order{
    ASCENDING, DSCENDING;
}

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Bubble Sort : "
                + Arrays.toString(mergeSort(array, 0, array.length)));
    }

    private static int[] mergeSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return array;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);

        merge(array, start, mid, end);

        return array;
    }

    private static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        //shift elements in array
        while (i < mid && j < end) {
            //copy smaller element from left or right partition and increase the counter
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        //shift left over elements from
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);

    }


}
