package Step3Arrays.easy;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/6/2023
 */
public class RightRotateArray {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        System.out.println("Original array :: " + Arrays.toString(arr) + " and K = " + k);
        rightRotateArrayByK(arr, k);
        System.out.println("Rotated array :: " + Arrays.toString(arr));
    }

    /**
     * Most optimised solution
     */
    private static void rightRotateArrayByK(long[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

    }

    // helper method to reverse elements
    private static void reverse(long[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // helper method to swap two elements
    private static void swap(long[] arr, int s, int e) {
        long temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
