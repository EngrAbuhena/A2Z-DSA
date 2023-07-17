/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        long n=5L;
//        System.out.printf("Factorial of %ll is %ll",n,factOfNNums(n));
        System.out.printf("Factorial of "+n+" is :: "+factOfNNums(n));
    }

    public static long factOfNNums(long n) {

        // base condition
        if (n == 0) return 1;

        return n * factOfNNums(n - 1);
    }
}
