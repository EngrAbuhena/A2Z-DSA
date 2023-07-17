package Step3Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author AbuhenaRony
 * @Date 7/13/2023
 * Sort an array of 0s, 1s and 2s
 */
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 0, 1, 0};

        sort012UsingLibrary(arr);
        System.out.println("Using library :: "+Arrays.toString(arr));

        sort012Better1(arr);
        System.out.println("Better 1 :: "+Arrays.toString(arr));

        sort012Better2(arr);
        System.out.println("Better 2 ::"+Arrays.toString(arr));

        sort012Optimal(arr);
        System.out.println("Using Dutch National Flag Algo :: "+Arrays.toString(arr));
    }

    // Brute Force Approach
    private static void sort012UsingLibrary(int[] arr){
        Arrays.sort(arr);
    }

    // Better Approach 1
    private static void sort012Better1(int[] arr){
        List<Integer> list = new ArrayList<>();

        for (int it:arr) {
            if (it == 0) list.add(it);
        }
        for (int it:arr) {
            if (it == 1) list.add(it);
        }
        for (int it:arr) {
            if (it == 2) list.add(it);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }
    }

    // Better Approach 2
    private static void sort012Better2(int[] arr){
        int count0=0,count1=0,count2=0;
        for (int j : arr) {
            if (j == 0) count0++;
            else if (j == 1) count1++;
            else count2++;
        }

        int i=0;
        while (i < count0) {
            arr[i]=0;
            i++;
        }
        while (i < count1) {
            arr[i]=1;
            i++;
        }
        while (i < count2) {
            arr[i]=2;
            i++;
        }
    }

    // Optimal Approach (Dutch National flag algorithm)
    private static void sort012Optimal(int[] arr){
        // Dutch National flag algorithm
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while (mid<=high)
        {
            if (arr[mid]==0)
            {
                // swapping arr[mid] and arr[low]
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else {
                // swapping arr[mid] and arr[high]
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
