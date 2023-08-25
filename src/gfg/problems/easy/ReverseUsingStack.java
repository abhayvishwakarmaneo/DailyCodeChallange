package gfg.problems.easy;

import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        String S="GeeksforGeeks";
        System.out.println(reverse(S));
    }
    public static String reverse(String S){
        //code here
        Stack<Character> rev = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            rev.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            sb.append(rev.pop());
        }
        return new String(sb);
    }
}
