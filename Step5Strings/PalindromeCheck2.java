/**
 * @author AbuhenaRony
 * <p>
 * leetcode
 */
package Step5Strings;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * https://leetcode.com/problems/valid-palindrome-ii/
 */

public class PalindromeCheck2 {
    public static void main(String[] args) {
        String str = "abca"; // true
        System.out.println("The String is palindrome :: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                boolean x = isValid(s, left + 1, right);
                boolean y = isValid(s, left, right - 1);
                return x || y;
            }
            left++;
            right--;
        }
        return true;
    }

    // checking after ignoring one character mis-matched
    public static boolean isValid(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}
