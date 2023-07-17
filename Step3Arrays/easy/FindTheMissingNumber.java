package Step3Arrays.easy;

import java.util.Arrays;

/**
 * @author AbuhenaRony
 * @Date 7/9/2023
 * Find the missing number from array
 */
public class FindTheMissingNumber {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 0, 3};

        System.out.println("Missing number is :: " + findMissingNumberUsingLinear(n, arr));
        System.out.println("Missing number is :: " + findMissingNumberUsingHash(n, arr));
        System.out.println("Missing number is :: " + findMissingNumberUsingSummation(n, arr));

    }

    // Naive Approach(Brute-force approach)
    private static int findMissingNumberUsingLinear(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            // flag variable to check if the element is present
            int flag = 0;

            for (int k : arr) {

                if (k == i) {
                    // element is present into the array
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) return i;
        }

        return -1;
    }

    // Better Approach (using Hashing)
    private static int findMissingNumberUsingHash(int n, int[] arr){
        int[] hash = new int[n+1];

        // if the index has an element hash array will have 1, otherwise 0
        for (int j : arr) {
            hash[j]++;
        }
        System.out.println("Hash array :: " + Arrays.toString(hash));

        for (int i = 0; i <= n; i++) {
            if (hash[i]==0) return i;
        }

        return -1;
    }

    // Summation Approach
    // optimal solution
    private static int findMissingNumberUsingSummation(int n, int[] arr){
        // sum of n numbers, starting from 0
        int sumOfNNumbers = (n*(n-1))/2;

        // sum of n numbers, starting from 1 = (n*(n+1))/2

        // sum of all array elements
        int sumOfArray=0;
        for (int it:arr)
            sumOfArray+=it;

        return sumOfNNumbers-sumOfArray; // return the missing number
    }

}
