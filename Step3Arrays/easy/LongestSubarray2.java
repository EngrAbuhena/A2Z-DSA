package Step3Arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AbuhenaRony
 * @Date 7/12/2023
 * Longest Subarray with sum K | [Positives and Negatives]
 */
public class LongestSubarray2 {
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1, 2, -2, 2, 2};
        System.out.println("Longest Subarray with sum K");
        System.out.println("Using two loops :: " + longestSubarrayTwoLoops(arr, k));
        System.out.println("Using hashing :: " + longestSubarrayHashing(arr, k));

        arr = new int[]{4, 5, 0, -2, -3, 1};
        k = 5;
        System.out.println("\nLength :: " + longestSubarrayDividedByK(arr, k));
    }

    //Better Approach (Using two loops)
    // length of the longest subarray
    private static int longestSubarrayTwoLoops(int[] arr, int k) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    //Optimal Approach (Using Hashing)
    // length of the longest subarray
    private static int longestSubarrayHashing(int[] arr, int k) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Insert initial sum 0 with index -1
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) maxLen = Math.max(maxLen, i + 1);

            int reminder = sum - k;

            if (map.containsKey(reminder)) {
                int len = i - map.get(reminder);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) map.put(sum, i);
        }
        return 0;
    }

    /*
      Longest subarray with sum divisible by K
      https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1
     */
    private static int longestSubarrayDividedByK(int[] arr, int k) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            int reminder = sum % k;

            // if reminder is negative, add k to make it positive
            if (reminder < 0) reminder += k;

            if (map.containsKey(reminder)) {
                int length = i - map.get(reminder);
                maxLength = Math.max(maxLength, length);
            } else map.put(reminder, i);
        }

        return maxLength;
    }

    /*
    Subarray Sums Divisible by K
    https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
    https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1
    */
    //TODO: leetcode and gfg problem
}
