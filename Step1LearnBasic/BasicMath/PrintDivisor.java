package Step1LearnBasic.BasicMath;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AbuhenaRony
 */
public class PrintDivisor {
    public static void printDivisor(int num) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                arr.add(i);
                int temp=num/i;
                if (temp!=i) arr.add(temp);
            }
        }

        for (Integer e : arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 36;
        printDivisor(n);
    }
}
