package Step3Arrays.medium;

/**
 * @author AbuhenaRony
 * @Date 7/13/2023
 * Kadane’s Algorithm : Maximum Subarray Sum in an Array
 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        System.out.println(maximumSubarraySumBetter(arr));

        arr = new int[]{-2, -1};
        System.out.println(maximumSubarraySumOptimal(arr));
    }

    // Better Approach
    private static long maximumSubarraySumBetter(int[] arr) {
        long maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    // Optimal Approach
    private static long maximumSubarraySumOptimal(int[] arr) {
        long sum = 0;
        long maxi = Long.MIN_VALUE; // maximum sum
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            maxi = Math.max(maxi, sum);
            if (sum < 0 && j < arr.length - 1) sum = 0;
        }
        return maxi;
    }

    // Optimal
    private static long maximumSubarraySumFollow(int[] arr){
        int n=arr.length;
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}
