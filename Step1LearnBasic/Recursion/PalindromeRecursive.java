/**
 * @author AbuhenaRony
 */
package Step1LearnBasic.Recursion;

public class PalindromeRecursive {
    public static void main(String[] args) {

        // Example string.
        String s = "madam";
        System.out.println(isPalindrome(0,s));
    }
    static boolean isPalindrome(int i, String s){

        // Base Condition
        // If i exceeds half of the string, means all the elements
        // are compared, we return true.
        if(i>=s.length()/2) return true;

        // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        // If both characters are same, increment i and check start+1 and end-1.
        return isPalindrome(i+1,s);
    }
}
