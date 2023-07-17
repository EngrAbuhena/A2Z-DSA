package Step3Arrays.easy;

/**
 * @author AbuhenaRony
 * @Date 7/5/2023
 */
public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 2, 4, 50, 8};
        System.out.println("Largest element in array is :: " + largest(arr));
    }

    public static int largest(int[] arr){
        int max = 0;
        int i = 0;
        while (i < arr.length-1)
        {
            if (arr[i]>max) max=arr[i];
            i++;
        }
        return max;
    }
}
