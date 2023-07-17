package LearnBasics.BasicMath;

/**
 * 
 * @author AbuhenaRony
 *
 */

public class CountDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(check(num));
	}

	public static int check(int num) {
		int count = 0, r = 0, n = num;
		do {
			r = n % 10;
			if (r != 0 && num % r == 0)
				count++;
			n = n / 10;
		} while (n != 0);
		return count;
	}
}