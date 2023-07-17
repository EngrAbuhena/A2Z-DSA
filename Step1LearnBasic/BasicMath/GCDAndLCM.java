package Step1LearnBasic.BasicMath;

/**
 * @author AbuhenaRony
 */
public class GCDAndLCM {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 75;

        System.out.println("GCD:: " + GCD(num1, num2));
        System.out.println("recursiveGCD:: " + recursiveGCD(num1, num2));

        // find lcm using gcd
        int lcm = (num1 * num2) / (recursiveGCD(num1, num2));
        System.out.println("LCM:: " + lcm);
    }

    public static int GCD(int num1, int num2) {

        // find the max & min number
        int min = Math.min(num1, num2);

        // answer
        int ans = 1;

        // loop
        for (int i = 2; i <= min; i++) {
            if (num2 % i == 0 && num1 % i == 0) ans = i;
        }

        // return answer
        return ans;
    }

    public static int recursiveGCD(int a, int b) {
        if (b == 0) return a;
        else return recursiveGCD(b, a % b);
    }
}
