package Step3Arrays.easy;

/**
 * @author AbuhenaRony
 * @Date 7/10/2023
 * Maximum Consecutive One
 */
public class FindMaximumConsecutiveOne {
    public static void main(String[] args) {
        int[] prices = {1, 0, 1, 1, 0, 1};
        System.out.println(maximumConsecutiveOne(prices));
    }

    private static int maximumConsecutiveOne(int[] arr){
        int i=0;
        int count=0;
        int maxCount= Integer.MIN_VALUE;
        while (i<arr.length)
        {
            if (arr[i]==1) count++;
            else count=0;

            if (count>maxCount) maxCount=count;
            // max=Math.max(max,count);

            i++;
        }

        maxCount=Math.max(maxCount,count);

        return maxCount;
    }
}
