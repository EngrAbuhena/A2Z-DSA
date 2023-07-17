package Step3Arrays.easy;

import java.util.*;

/**
 * @author AbuhenaRony
 * @Date 7/5/2023
 * <p>
 * Second Smallest Algo:
 * <p>
 * If the current element is smaller than ‘small’, then we update second_small and small variables
 * Else if the current element is smaller than ‘second_small’ then we update the variable ‘second_small’
 * Once we traverse the entire array, we would find the second-smallest element in the variable second_small.
 * Here’s a quick demonstration of the same.
 * <p>
 * Second Largest Algo:
 * <p>
 * If the current element is larger than ‘large’ then update second_large and large variables
 * Else if the current element is larger than ‘second_large’ then we update the variable second_large.
 * Once we traverse the entire array, we would find the second-largest element in the variable second_large.
 * Here’s a quick demonstration of the same.
 */
public class SecondLargestAndSmallestElementArray {
    public static void main(String[] args) {

        int[] array = {12, 11, 1, 4, 2};

        // to make the array with distinct elements
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        Set<Integer> uniqueSet = new HashSet<>(list);
        Integer[] arr = uniqueSet.toArray(new Integer[0]);


        // output
        System.out.println("Array :: "+Arrays.toString(arr));
//        Arrays.sort(arr); // no need to sort
        System.out.println("Second largest :: " + secondLargest(arr));
        System.out.println("Second smallest :: " + secondSmallest(arr));

    }


    public static int secondLargest(Integer[] arr) {

        if (arr.length < 2) return -1;

        int largestElement = Integer.MIN_VALUE;

        int secondLargestElement = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > largestElement) {
                secondLargestElement = largestElement;
                largestElement = j;
            } else if (j > secondLargestElement && j != largestElement) {
                secondLargestElement = j;
            }
        }

        return secondLargestElement;
    }


    public static int secondSmallest(Integer[] arr) {

        int smallestElement = Integer.MAX_VALUE;

        int secondSmallestElement = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = j;
            } else if (j < secondSmallestElement && j != smallestElement) {
                secondSmallestElement = j;
            }
        }

        return secondSmallestElement;
    }
}
