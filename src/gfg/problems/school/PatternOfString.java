package gfg.problems.school;

import java.util.ArrayList;

public class PatternOfString {
    public static void main(String[] args) {
        String str = "Geeks";

        System.out.println(pattern(str));
    }
    static ArrayList<String> pattern(String S) {
        // code here
        ArrayList<String> strList = new ArrayList<>();

        for(int i = S.length(); i > 0; i--){
            strList.add(S.substring(0, i));
        }
        return strList;
    }
}
