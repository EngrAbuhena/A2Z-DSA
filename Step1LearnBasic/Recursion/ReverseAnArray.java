/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        reverseWithSecondArray(arr);

        reverseWithPointer(arr);

        reverseWithRecursive(arr, 0, arr.length - 1);

        reverseWithLibrary(arr);
    }

    public static void printArray(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void reverseWithSecondArray(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];

        for (int j = len - 1; j >= 0; j--) {
            ans[len - j - 1] = arr[j];
        }
        printArray(ans);
    }

    public static void reverseWithPointer(int[] arr) {
        int len = arr.length;
        int p1 = 0;
        int p2 = len - 1;
        while (p1 < p2) {
            //swap
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr);
    }

    public static void reverseWithRecursive(int[] arr, int start, int end) {
        if (start < end) {
            Collections.swap(Collections.singletonList(arr), start, end);
            reverseWithRecursive(arr, start + 1, end - 1);
        }
        printArray(arr);
    }

    public static void reverseWithLibrary(int[] arr) {
        Collections.reverse(Collections.singletonList(arr));
//         Collections.reverse(Arrays.asList(arr));
        printArray(arr);
    }
}
