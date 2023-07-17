package Step3Arrays.easy;

import java.util.*;

/**
 * @author AbuhenaRony
 * @Date 7/8/2023
 * <p>
 * Find Union of Two Sorted Array
 */
public class FindUnionOfTwoSortedArray {
    public static void main(String[] args) {
        int n = 2, m = 8;
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        // [1, 6, 9, 13, 15, 20, 25, 29, 35, 46]

        List<Integer> union1;
        union1 = findUnionUsingMap(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is " + union1);

        List<Integer> union2 = findUnionUsingSet(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is " + union2);

        List<Integer> union3 = findUnionUsingTwoPointers(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is " + union3);
    }

    // using map
    private static List<Integer> findUnionUsingMap(int[] arr1, int[] arr2, int n, int m) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

//         //List<Integer> union=new ArrayList<>();
//         //for(int it:map.keySet()) union.add(it);

        return new ArrayList<>(map.keySet());
    }


    /**
     * Optimised solution
     * But not get the accurate answer for every test cases
     * Easier than map
     * using set
     */
    private static List<Integer> findUnionUsingSet(int[] arr1, int[] arr2, int n, int m) {
        Set<Integer> set = new HashSet<>();

        int i = 0;
        while (i < n) {
            set.add(arr1[i]);
            i++;
        }

        int j = 0;
        while (j < m) {
            set.add(arr2[j]);
            j++;
        }

        return new ArrayList<>(set);
    }

    /**
     * Most Optimised
     * Always give accurate answers for all test cases
     * using two pointers
     */
    private static List<Integer> findUnionUsingTwoPointers(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            if (union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            if (union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        return union;
    }
}
