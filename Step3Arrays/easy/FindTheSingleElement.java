package Step3Arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AbuhenaRony
 * @Date 7/10/2023
 */
public class FindTheSingleElement {
    public static void main(String[] args) {
        int n=11;
        int[] arr={1, 1, 2, 2, 3, 3, 6, 6, 7, 7, 9}; // 9
        System.out.println("The single element is");
        System.out.println("Using linear search :: "+findSingleElementLinear(arr));
//        System.out.println("Using binary search :: "+findSingleElementUsingBinarySearch(arr));
        System.out.println("Using Hashing :: "+findSingleElementUsingHashing(arr));
        System.out.println("Using HashMap :: "+findSingleElementUsingHashmap(arr));
        System.out.println("Using XOR :: "+findSingleElementUsingXOR(arr));


    }

    // Naive Approach(Brute-force approach)
    private static int findSingleElementLinear(int[] arr){
        for (int num : arr) {

            int count = 0;
            for (int i : arr) {
                if (num == i) count++;
            }

            if (count == 1) return num;
        }

        return 0;
    }

    // Optimal Approach(Using Binary Search)
    private static int findSingleElementUsingBinarySearch(int[] arr){
        for (int num : arr) {
            int l = 0;
            int r = arr.length - 1;

            int count = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (num == arr[mid]) count++;
                else if (num < arr[mid]) r = mid - 1;
                else l = mid + 1;
            }

            if (count == 1) return num;
        }
        return -1;
    }

    // Better Approach(Using Hashing)
    private static int findSingleElementUsingHashing(int[] arr){

        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int j : arr) {
            maxi = Math.max(maxi, j);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int j : arr) {
            hash[j]++;
        }

        //Find the single element and return the answer:
        for (int j : arr) {
            if (hash[j] == 1)
                return j;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    // Hashing using the map data structure
    private static int findSingleElementUsingHashmap(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        // find the single element
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey()+"=>"+entry.getValue());
            if (entry.getValue()==1) return entry.getKey();
        }

        return -1;
    }

    // Optimal Approach(Using XOR)
    private static int findSingleElementUsingXOR(int[] arr){
        // XOR all elements of the array
        int xor=0;
        for (int j : arr) {
            xor = xor ^ j;
        }
        return xor;
    }
}
