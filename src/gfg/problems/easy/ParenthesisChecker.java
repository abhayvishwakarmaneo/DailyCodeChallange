package gfg.problems.easy;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{([])}";

        System.out.println(ispar(str));
    }
    static boolean ispar(String s)
    {
        if (s.length() <= 1)
            return false;
        Stack<Character> parenthesis = new Stack();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || parenthesis.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parenthesis.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && parenthesis.peek() == '(' || s.charAt(i) == ']' && parenthesis.peek() == '[' || s.charAt(i) == '}' && parenthesis.peek() == '{') {
                parenthesis.pop();
            } else {
                parenthesis.push(s.charAt(i));
            }
        }

        if (!parenthesis.isEmpty()) {
            flag = false;
        }

        return flag;
    }
}