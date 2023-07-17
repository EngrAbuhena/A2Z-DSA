/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

public class PrintToNTimes {
    public static void main(String[] args) {
        printToN(12);
    }

    public static void printToN(int n)
    {
        if(n==0) return;
        System.out.print(n+" ");
        printToN(n-1);
    }
}
