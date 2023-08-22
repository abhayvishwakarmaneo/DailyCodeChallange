package gfg.problems.school;

import java.util.List;

public class VowelOrNot {
    public static void main(String[] args) {
        char c = 'c';

        System.out.println(isVowel(c));
    }
    static String isVowel(char c){
        // code here
        String res = "";
        List<Character> vowels = List.of('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');
        if(vowels.contains(c))
            res = "YES";
        else
            res = "NO";

        return res;
    }
}