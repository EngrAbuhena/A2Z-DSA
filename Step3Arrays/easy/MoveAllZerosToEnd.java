package Step3Arrays.easy;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/8/2023
 */
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        int[] result = moveZeros(arr);
        System.out.println(Arrays.toString(result));

        int[] res = moveZerosOpt(arr);
        System.out.println(Arrays.toString(res));
    }

    // This method is passed by CodeStudio, GFG and LeetCode
    private static int[] moveZeros(int[] arr)
    {
        int[] ans = new int[arr.length];

        int x=0;
        for (int j : arr) {
            if (j != 0) {
                ans[x] = j;
                x++;
            }
        }

        for (int j : arr) {
            if (j == 0) {
                ans[x] = j;
                x++;
            }
        }
        return ans;
    }

    /**
     * Optimized solution
     */
    private static int[] moveZerosOpt(int[] arr){
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return arr;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        return arr;
    }
}
