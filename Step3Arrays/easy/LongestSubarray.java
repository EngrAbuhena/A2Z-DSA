package Step3Arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AbuhenaRony
 * @Date 7/11/2023
 * Longest Subarray with given Sum K(Positives)
 */
public class LongestSubarray {
    public static void main(String[] args) {

        int k=3;
        int[] arr={1,2,1,2,1};
        System.out.println("Longest Subarray with given Sum K(Positives)");
        System.out.println("Linear :: "+longestSubarrayLinear(arr,k));
        System.out.println("Using two loops :: "+longestSubarrayTwoLoops(arr,k));
        System.out.println("Using hashing :: "+ longestSubarrayHashing(arr,k));
        System.out.println("Using two pointers :: "+ longestSubarrayTwoPointers(arr,k));
    }

    // Naive Approach (Brute-force approach)
    private static int longestSubarrayLinear(int[] arr,int k){
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                long sum=0;
                for (int l = i; l <= j; l++) {
                    sum+=arr[l];
                }
                if (sum==k) len=Math.max(len,j-i+1);
            }
        }
        return len;
    }

    // Optimizing the Naive Approach (Using two loops)
    private static int longestSubarrayTwoLoops(int[] arr, int k){
        int maxLen=0;
        for (int i = 0; i < arr.length; i++) {
            long sum=0;
            for (int j = i; j < arr.length; j++) {
                sum=sum+arr[j];
                if (sum==k) maxLen=Math.max(maxLen,j-i+1);
            }

        }
        return maxLen;
    }

    // Better Approach(Using Hashing)
    private static int longestSubarrayHashing(int[] arr, int k){
        Map<Long,Integer> map = new HashMap<>();
        int maxLen=0;
        long sum=0;
        for (int i = 0; i < arr.length; i++) {

            // calculate sum till index i
            sum+=arr[i];

            // if sum equal k then update maxLen
            if (sum==k) maxLen=Math.max(maxLen,i+1);

            // calculate the sum of remaining part
            long rem=sum-k;

            // calculate the length and update maxLen
            if (map.containsKey(rem))
            {
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }

            // update the map by checking the condition
            if (!map.containsKey(sum))
                map.put(sum,i);
        }
        return maxLen;
    }

    // Optimal Approach (Using 2 pointers)
    private static int longestSubarrayTwoPointers(int[] arr, int k){
        int left=0;
        int right=0;
        long sum=arr[0];
        int maxLen=0;
        while(right<arr.length)
        {
            // if sum>k, reduce the subarray from left
            // until sum become less or equal to k
            while(left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }

            // if sum=k, update maxLen
            if (sum==k) maxLen=Math.max(maxLen,right-left+1);

            // move forward right pointer
            right++;
            if (right<arr.length) sum+=arr[right];
        }

        return maxLen;
    }
}
