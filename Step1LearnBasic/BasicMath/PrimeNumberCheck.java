/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.BasicMath;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 29;
        System.out.println("Number is prime::" + isPrime(number));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
