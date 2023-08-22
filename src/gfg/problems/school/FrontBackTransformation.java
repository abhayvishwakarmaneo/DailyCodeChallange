package gfg.problems.school;

import java.util.ArrayList;
import java.util.List;

public class FrontBackTransformation {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(convert(s));
    }

    static String convert(String s) {
        List<Character> alphabets = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        int n = alphabets.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(" ");
            } else {
                int index = alphabets.indexOf(Character.toLowerCase(c));
                if (c == Character.toUpperCase(c)) {
                    sb.append(Character.toUpperCase(alphabets.get(n - index - 1)));
                } else {
                    sb.append(alphabets.get(n - index - 1));
                }
            }
        }
        s = new String(sb);
        return s;
    }
}
