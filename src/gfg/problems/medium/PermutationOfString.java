package gfg.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "ABC";

        System.out.println(find_permutation(s));
    }
    public static List<String> find_permutation(String S) {
        // Code here
        List<String> strlist = new ArrayList<>();
        for(int i = 0; i < S.length(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(S.charAt(i));
            for(int j = 0; j < S.length(); j++){
                if(i == j)
                    continue;
                else
                    sb.append(S.charAt(j));
            }
            strlist.add(String.valueOf(sb));
        }

        return strlist;
    }
}
