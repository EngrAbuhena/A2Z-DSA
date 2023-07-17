/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        findFibonacciNumbers(n);
        System.out.println("Sum of Fibonacci numbers using recursion :: " + sumOfFibonacciRecursion(n));
        System.out.println("Sum of Fibonacci numbers :: " + sumOfFibonacci(n));
    }

    public static void findFibonacciNumbers(int n) {
        if (n == 0) System.out.println(0);
        else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            System.out.print("Fibonacci numbers from 0 to N :: " + fib[0] + " " + fib[1] + " ");
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                System.out.print(fib[i] + " ");
            }
            System.out.println();
        }
    }

    // recursive method
    // leetcode
    // https://leetcode.com/problems/fibonacci-number/
    public static int sumOfFibonacciRecursion(int n) {

        // base condition
        if (n <= 1) return n;

        // recursive condition
        return sumOfFibonacciRecursion(n - 1) + sumOfFibonacciRecursion(n - 2);
    }


    // cannot provide accurate answer
    // gfg
    // https://practice.geeksforgeeks.org/problems/fibonacci-sum1423/1
    private static int sumOfFibonacci(int n) {
        if (n <= 1) return n;
        else {
            int[] fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            int count = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
                count += fib[i];
            }
            return count % 1000000007;
        }
    }
}
