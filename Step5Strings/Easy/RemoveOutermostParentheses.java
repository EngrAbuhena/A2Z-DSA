package Step5Strings.Easy;

/**
 * @author AbuhenaRony
 * @Date 7/13/2023
 * Remove Outermost Parentheses
 */
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "((0-9))(1-3)(((4+5)((0/2)(5-1)(5/9))(9-0)((4/3)(2+7))(3-6)(((6+2)))))\n";
        System.out.println(maxCountOutermostParentheses(str));
        System.out.println(removeOutermostParentheses(str));
    }

    // codeStudio - https://www.codingninjas.com/codestudio/problems/maximum-nesting-depth-of-the-parentheses_8144741
    private static int maxCountOutermostParentheses(String str) {
        int maxDepth = 0;
        int depth = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                depth++;
            } else if (c == ')') {
                maxDepth = Math.max(maxDepth, depth);
                depth--;
            }
        }
        return maxDepth;
    }

    // leetCode - https://leetcode.com/problems/remove-outermost-parentheses/
    // gfg - https://practice.geeksforgeeks.org/problems/outermost-parentheses/1
    private static String removeOutermostParentheses(String str) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        for (char c : str.toCharArray()) {
            if (c == '(' && open > 0) {
                result.append(c);
                open++;
            } else if (c == ')' && open > 1) {
                result.append(c);
                open--;
            } else if (c == '(' && open == 0) {
                open++;
            } else if (c == ')' && open == 1) {
                open--;
            }
        }
        return result.toString();
    }
}
