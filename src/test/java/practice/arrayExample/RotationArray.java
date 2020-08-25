package practice.arrayExample;

import java.util.Arrays;

/**
 * a=[1,2,3,4,5,6,7]
 * b=[4,5,6,7,1,2,3]
 * <p>
 * index of 1 in frist arrary is 0 where as
 * index of 1 in second array is 4 </p>
 */
public class RotationArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {4, 5, 6, 7, 1, 2, 3, 4};
        System.out.println("Array A : " + Arrays.toString(a));
        System.out.println("Array B : " + Arrays.toString(b));
        boolean result = compareArray(a, b);
        if (result) {
            System.out.println("Arrays match in rotation");
        } else {
            System.out.println("Array Doesn't match in rotation");
        }
    }

    private static boolean compareArray(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        //find index of first element of first array in second array
        int key = -1;
        for (int i = 0; i < a.length; i++) {
            if (b[i] == a[0]) {
                key = i;
                break;
            }
        }

        if (key == -1) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int index = (key + i) % a.length;
            if (a[i] != b[index]) {
                return false;
            }
        }
        return true;
    }
}
