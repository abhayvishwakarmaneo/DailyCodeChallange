package gfg.problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "zvvo";
        System.out.println(removeDups(s));
    }

    static String removeDups(String S) {
        // code here
        ArrayList<Character> uniques = new ArrayList<>();
        for(int  i = 0; i < S.length(); i++){
            if(!uniques.contains(S.charAt(i))){
                uniques.add(S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : uniques){
            sb.append(ch);
        }

        return new String(sb);
    }
}
