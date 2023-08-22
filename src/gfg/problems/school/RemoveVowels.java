package gfg.problems.school;

import java.util.List;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Welcome to The Programming!!!";

        System.out.println(removeVowels(str));
    }

    static String removeVowels(String S) {
        // code here
        List<Character> vowels = List.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (!vowels.contains(S.charAt(i))) {
                str.append(S.charAt(i));
            }
        }

        S = str.toString();
        return S;
    }
}
