package Step3Arrays.easy;

/**
 * @author AbuhenaRony
 * @Date 7/5/2023
 * <p>
 * check if the array is sorted in ascending order
 */
public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 9, 8, 4, 3, 0};

        System.out.println("Array is sorted :: " + isArraySorted(arr1));
        System.out.println("Array is sorted :: " + isArraySorted(arr2));
    }

    private static boolean isArraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

    // leetcode
    // https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
    // Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.
    private boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) count++;
        }
//        if(count>1) return false;
//        else return true;
        return count <= 1;
    }
}
