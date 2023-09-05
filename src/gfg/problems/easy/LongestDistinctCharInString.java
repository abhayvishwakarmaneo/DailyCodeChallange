package gfg.problems.easy;

import java.util.ArrayList;

public class LongestDistinctCharInString {
    public static void main(String[] args) {
//        String S = "aaa";
        String S = "aewergrththy";
        System.out.println(longestSubstrDistinctChars(S));
    }

    static int longestSubstrDistinctChars(String S) {
        // code here
//        ArrayList<Character> list = new ArrayList<>();
//        int longest = 0;
//        for(int j = 0 ; j < S.length()-1; j++){
//            for(int i = j ;i < S.length(); i++){
//                if(!list.contains(S.charAt(i)))
//                    list.add(S.charAt(i));
//                else{
//                    list.clear();
//                    list.add(S.charAt(i));
//                }
//                if(longest < list.size())
//                    longest = list.size();
//            }
//            list.clear();
//        }
//
//        return longest;
//===================Above code has more time complexity than below Code=========================
        ArrayList<Character> list = new ArrayList<>();
        int longest = 0;

        for (int i = 0; i < S.length(); i++) {
            if (!list.contains(S.charAt(i)))
                list.add(S.charAt(i));
            else {
                char ch = S.charAt(i);
                i--;
                while(ch != S.charAt(i)){
                    i--;
                }
                list.clear();
                i++;
                list.add(S.charAt(i));
            }
            if (longest < list.size())
                longest = list.size();
        }

        return longest;
    }
}
