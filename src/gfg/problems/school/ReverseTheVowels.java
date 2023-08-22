package gfg.problems.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseTheVowels {
    static String modify(String s) {
        // your code here
        List<Character> vowels = List.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');
        Stack<Character> strVowels = new Stack<>();
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c))
                strVowels.push(c);
        }

        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (vowels.contains(c)) {
                c = strVowels.pop();
            }
            newString.append(c);
        }

        s = newString.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "practice";

        System.out.println(modify(s));
    }
}