/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Hashing;

import java.util.*;

public class FindHighestAndLowestFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        highestAndLowestFrequency(arr);

        int[] arr1 = {9, 1, 1, 5, 1, 7, 7, 1, 5, 7};
        highestAndLowestFrequencyHashMap(arr1);

        int[] arr2 = {9, 1, 1, 5, 1, 7, 7, 1, 5, 7};
        int[] arr3 = topK(arr2, 3); // 1 7 5
        for (int i : arr3) {
            System.out.print(i + " ");
        }

    }

    // Brute-Force approach(Using two loops)
    public static void highestAndLowestFrequency(int[] arr) {

        boolean[] isVisited = new boolean[arr.length];

        int max = 0, maxEl = 0, min = arr.length, minEl = 0;
        for (int i = 0; i < arr.length; i++) {

            if (isVisited[i]) continue;

            // count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    isVisited[i] = true;
                    count++;
                }

            }

            // find max frequency
            if (count > max) {
                max = count;
                maxEl = arr[i];
            }

            // find min frequency
            if (count < min) {
                min = count;
                minEl = arr[i];
            }
        }

        System.out.println("max :: " + max + " for element " + maxEl + "\n" + "min :: " + min + " for element " + minEl);
    }

    // Optimized approach(Using Map/HashMap)
    public static void highestAndLowestFrequencyHashMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        int max = 0, maxEl = 0;
        int min = arr.length, minEl = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEl = entry.getKey();
            }
            if (entry.getValue() < min) {
                min = entry.getValue();
                minEl = entry.getKey();
            }
        }

        System.out.println("max :: " + max + " for element " + maxEl + "\n" + "min :: " + min + " for element " + minEl);
    }

    // gfg
    // https://practice.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
    public static int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());
        sorted.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            //new Comparator<T>() will create an anonymous class which actually implements Comparator interface
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue())
                    return -1; // -1 means do not swap
                else if (o1.getValue() < o2.getValue())
                    return 1; // 1 means swap
                else {
                    if (o1.getKey() > o2.getKey())
                        return -1; // -1 means do not swap
                    else // o1.getKey() <= o2.getKey()
                        return 1; // 1 means swap
                }
            }
        });

        System.out.println(sorted);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = sorted.get(i).getKey();
        }

        return ans;
    }
}
