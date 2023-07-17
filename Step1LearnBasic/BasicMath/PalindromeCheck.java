package Step1LearnBasic.BasicMath;

/**
 * @author AbuhenaRony
 */
public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 12321;
        System.out.println("The number is a palindrome :: " + is_palindrome(number));
    }

    public static String is_palindrome(int n) {
        // int to string
        String str = Integer.toString(n);

        // reverse the string
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--)
            revStr = revStr + str.charAt(i);

        // check if the reversed string is same with original string
        if (str.equals(revStr)) return "Yes";
        else return "No";
    }
}
