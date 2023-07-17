package Step3Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AbuhenaRony
 * @Date 7/12/2023
 * Two Sum : Check if a pair with given sum exists in Array
 */
public class TwoSum {
    public static void main(String[] args) {
        int target = 5;
        int[] book = {4, 1, 2, 3, 1};
        System.out.println("Two Sum");

        System.out.println("Linear First variant :: " + readLinearFirstVariant(book, target));
        System.out.println("Linear Second variant :: " + Arrays.toString(readLinearSecondVariant(book, target)));

        System.out.println("Hashing First variant :: " + readHashingFirstVariant(book, target));
        System.out.println("Hashing Second variant :: " + Arrays.toString(readHashingSecondVariant(book, target)));

        System.out.println("Two pointers First variant :: " + readTwoPointersFirstVariant(book, target));
        System.out.println("Two pointers Second variant :: " + Arrays.toString(readTwoPointersSecondVariant(book, target)));

    }

    // Naive Approach(Brute-force approach)
    private static String readLinearFirstVariant(int[] book, int target) {
        for (int i = 0; i < book.length; i++) {
            for (int j = i; j < book.length - 1; j++) {
                if (book[i] + book[j] == target) return "YES";
            }
        }
        return "NO";
    }

    private static int[] readLinearSecondVariant(int[] book, int target) {

        for (int i = 0; i < book.length; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (book[i] + book[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    // Better Approach(using Hashing)
    private static String readHashingFirstVariant(int[] book, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < book.length; i++) {
            int num = target - book[i];
            if (map.containsKey(num)) {
                return "YES";
            }
            map.put(book[i], i);
        }
        return "NO";
    }
    private static int[] readHashingSecondVariant(int[] book,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < book.length; i++) {
            int num=target-book[i];
            if (map.containsKey(num)) return new int[]{map.get(num),i};
            map.put(book[i], i);
        }
        return null;
    }

    // Optimized Approach(using two-pointer)
    private static String readTwoPointersFirstVariant(int[] book, int target){
        Arrays.sort(book);
        int left=0;
        int right=book.length-1;
        while(left<right)
        {
            int sum=book[right]+book[left];
            if (sum==target) return "YES";
            else if (sum<target) left++;
            else right--;
        }
        return "NO";
    }
    // the result of this method is mismatched
    private static int[] readTwoPointersSecondVariant(int[] book, int target){
        Arrays.sort(book);
        int left=0;
        int right=book.length-1;
        while(left<right)
        {
            int sum=book[left]+book[right];
            if (sum==target) return new int[]{left,right};
            else if (sum<target) left++;
            else right--;
         }
        return null;
    }
}
