package gfg.problems.easy;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{([])}";

        System.out.println(ispar(str));
    }
    static boolean ispar(String x)
    {
        boolean flag = false;
        Stack<Character> brackets = new Stack<>();
        for(int i = 0; i < x.length(); i++){
            brackets.push(x.charAt(i));
        }
        for(int i = 0; i < brackets.size()/2; i++) {
            flag = false;
            Character pop = brackets.pop();
            if (x.charAt(i) == '{' && pop == '}') {
                flag = true;
            } else if (x.charAt(i) == '(' && pop == ')') {
                flag = true;
            } else if (x.charAt(i) == '[' && pop == ']') {
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }

        return flag;
    }
}