package practice.sortingAlgorithm;

import java.util.Arrays;

public class AllAlgorithms {
    public static void main(String[] args) {
        int[] array = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Bubble Sort : " + Arrays.toString(bubbleSort(array)));
        int[] array2 = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Selection Sort : " + Arrays.toString(selectionSort(array2)));
        int[] array3 = {8, 8, 6, -22, 5, 4, -7, 3, 0, -1, 2, 1, 7, -23};
        System.out.println("Insertion Sort : " + Arrays.toString(insertionSort(array3)));
    }

    private static int[] bubbleSort(int[] array) {
        //compare elements and swap
        int loop = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                loop++;
//                System.out.println("loop : " + loop + " compare " + array[i] + " with " + array[j]);
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }

        System.out.println("BubbleSort loop count :: " + loop);

        loop = 0;
        int sortedPosition = array.length;
        while (sortedPosition > 0) {
            for (int i = 0; i < sortedPosition - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
                loop++;
            }
//            System.out.println("BubbleSort loop cnt :: " + loop);
            sortedPosition--;
        }

        return array;
    }

    private static void swap(int[] array, int first, int second) {
        if (array[first] == array[second]) {
            return;
        }
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    private static int[] selectionSort(int[] array) {
//        int sortedIndex = array.length;
        for (int sortedIndex = array.length - 1; sortedIndex > 0; sortedIndex--) {
            int largest = 0;
            for (int i = 1; i < sortedIndex; i++) {
                if (array[largest] < array[i]) {
                    largest = i;
                }
            }
            if (array[largest] > array[sortedIndex]) {
                swap(array, largest, sortedIndex);
            }
        }
        return array;
    }

    private static int[] insertionSort(int[] array) {
        for (int firstElement = 1; firstElement < array.length; firstElement++) {
            int newElement = array[firstElement];
            int i;
            for (i = firstElement; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
            System.out.println("After first iteration :: " + Arrays.toString(array));
        }
        return array;
    }
}
