/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 5, 10, 15};
        countFrequency(arr);
        countFrequencyUsingMap(arr);
    }

    // count using two nested loops
    public static void countFrequency(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) continue;

            // count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " is " + count + " times");
        }
    }

    // count using Map/HashMap
    static void countFrequencyUsingMap(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1); // put(key, value)
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " times.");
        }
    }
}
