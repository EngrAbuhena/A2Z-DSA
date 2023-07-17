package Step3Arrays.easy;

/**
 * @author AbuhenaRony
 * @Date 7/8/2023
 *
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=7;
        System.out.println(linearSearch(arr,k));
    }

    private static int linearSearch(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k) return i;
        }

        return -1;
    }
}
