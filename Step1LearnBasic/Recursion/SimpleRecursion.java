/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

public class SimpleRecursion {
    public static void main(String[] args) {
        recursiveFunction(12);
    }

    private static int i = 1;

    public static void recursiveFunction(int n) {
        if (i > n) return;
        else {
            System.out.print(i + " ");
            ++i;
            recursiveFunction(n);
        }
    }
}
