/**
 * @author AbuhenaRony
 *
 * leetcode
 */
package Step5Strings;

/**
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * https://leetcode.com/problems/valid-palindrome/
 */

public class PalindromeCheckString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("The string is a palindrome :: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        // removing non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // converting all characters to lowercase
        str = str.toLowerCase();

        System.out.println(str);

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
