package Step3Arrays.easy;

import java.util.*;

/**
 * @author AbuhenaRony
 * @Date 7/6/2023
 */
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        System.out.println("Original array :: " + Arrays.toString(arr));

        System.out.println("Size of unique elements :: " + removeDuplicateElements(arr));
        System.out.println("Size of unique elements using collections :: " + removeDuplicatesWithCollections(arr));


    }

    // find out number of unique elements in the array
    private static int removeDuplicateElements(int[] arr) {
        int count = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[count] != arr[j]) {
                count++;
                arr[count] = arr[j];
            }
        }

        return count + 1;
    }

    // using collections framework
    private static int removeDuplicatesWithCollections(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int e:arr)
            list.add(e);
        Set<Integer> unique = new HashSet<>(list);

        Integer[] array = unique.toArray(new Integer[0]);

        return array.length;
    }
}
