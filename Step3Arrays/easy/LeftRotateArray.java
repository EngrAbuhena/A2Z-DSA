package Step3Arrays.easy;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/6/2023
 */
public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original array :: " + Arrays.toString(arr));

        leftRotateArrayByOne(arr);
        System.out.println("Rotated array :: " + Arrays.toString(arr));


        long[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        System.out.println("Original array :: " + Arrays.toString(arr1) + " and K = " + k);
        leftRotateArrayByK(arr1, k);
        System.out.println("Rotated array :: " + Arrays.toString(arr1));
    }

    private static void leftRotateArrayByOne(int[] arr) {
        int temp = arr[0]; // storing the first element of the array in a variable
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp; // assigning the variable as the last element
    }


    /**
     * Most optimised solution
     */
    private static void leftRotateArrayByK(long[] arr, int k) {
        int n = arr.length;
        k = k % n; // Adjust k to ensure rotation within array bounds

        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the entire array

    }

    // Helper method to reverse the elements
    private static void reverse(long[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements
    private static void swap(long[] arr, int s, int e) {
        long temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
