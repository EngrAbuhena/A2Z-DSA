/**
 * @auther AbuhenaRony
 */
package Step5Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "education";
        System.out.println("Original String :: " + str);
        System.out.println("Reversed String :: " + reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            revStr.insert(0, str.charAt(i));
        }
        return revStr.toString();
    }
}
