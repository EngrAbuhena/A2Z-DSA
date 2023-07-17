/**
 * @author AbuhenaRony
 *
 * using recursion didn't get the original output in gfg
 */
package Step1LearnBasic.Recursion;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(50000)); //output::1562562500625000000
        parameterizedRecursion(5000,0);
        System.out.println("functional recursion :: "+functionalRecursion(5000));
    }

    public static long sumOfSeries(long n) {
        if (n == 0) return 0;
        return (long) Math.pow((n * (n+1)/2),2);
    }

    // recursive method
    static void parameterizedRecursion(int i, int sum){

        // Base Condition.
        if(i<1){

            System.out.println("Parameterized Recursion :: "+sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        parameterizedRecursion(i-1,sum+i);
    }

    static int functionalRecursion(int n){

        // Base Condition.
        if(n == 0) return 0;

        // Problem broken down into 2 parts and then combined.
        return n + functionalRecursion(n-1);
    }
}
