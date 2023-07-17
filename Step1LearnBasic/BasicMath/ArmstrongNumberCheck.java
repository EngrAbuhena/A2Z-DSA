package Step1LearnBasic.BasicMath;

/**
 * @author AbuhenaRony
 */
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrongNumber(number));
    }

    public static String isArmstrongNumber(int num) {
        int temp = num, originalNumber = num, sum = 0, count = 0;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        // System.out.println(count + " " + num);
        while (num != 0) {
            int digit = num % 10;
            sum = (int) (Math.pow(digit, count) + sum);
            num = num / 10;
        }
        // System.out.println(sum);
        if(originalNumber == sum) return "Yes";
        else return "No";
    }


}
