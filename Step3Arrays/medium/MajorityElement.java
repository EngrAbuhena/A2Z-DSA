package Step3Arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AbuhenaRony
 * @Date 7/13/2023
 * Find the Majority Element that occurs more than N/2 times
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};

        System.out.println("Majority Element");
        System.out.println("Brute Force :: "+ majorityElementLinear(arr));
        System.out.println("Hashing :: "+majorityElementHashing(arr));
        System.out.println("Moore's Voting Algo :: "+majorityElementOptimal(arr));

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(4);
        list.add(9);
        list.add(7);
        System.out.println(majorityElementII(list));
    }

    // Naive/Brute Force Approach
    private static int majorityElementLinear(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) count++;
                if (count>(arr.length/2)) return arr[i];
            }
        }
        return -1;
    }

    // Better
    private static int majorityElementHashing(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();

        for (int it:arr)
        {
            map.put(it,map.getOrDefault(it,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue()>(arr.length/2)) return entry.getKey();
        }
        return -1;
    }

    // Optimal Approach: Moore’s Voting Algorithm
    private static int majorityElementOptimal(int[] arr){
        // Moore’s Voting Algorithm

        // first: find the majority element
        int element =0;
        int count=0;
        for (int k : arr) {

            if (count == 0) {
                count = 1;
                element = k;
            } else if (element == k) count++;
            else count--;
        }

        // then: find the count of the majority element
        int count2=0;
        for (int j : arr) {
            if (element == j) count2++;
        }

        // then: if the count is greater than the condition then return the element
        if (count2>(arr.length/2)) return element;

        return -1;
    }

    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for(int it : arr)
        {
            map.put(it,map.getOrDefault(it,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>(n/3)) list.add(entry.getKey());
        }

        if(list.isEmpty()) list.add(-1);

        return list;
    }
}
