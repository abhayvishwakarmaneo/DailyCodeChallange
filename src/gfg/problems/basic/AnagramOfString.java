package gfg.problems.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramOfString {
    public static void main(String[] args) {
        String s1 = "bcadeh";
        String s2 = "hea";

        System.out.println(remAnagrams(s1, s2));
    }
    public static int remAnagrams(String a,String b)
    {
        StringBuilder str1 = new StringBuilder(a);
        StringBuilder str2 = new StringBuilder(b);
        int res = -1;
        if(str1.length() > str2.length()){
            for(int i = 0; i < str2.length(); i++){
                int index = str1.indexOf(String.valueOf(str2.charAt(i)));
                if(index >= 0){
                    str1.deleteCharAt(index);
                    str2.deleteCharAt(i);
                    i--;
                }
            }
            res = str1.length()+str2.length();
        }else {
            for(int j = 0; j < str1.length(); j++){
                int index = str2.indexOf(String.valueOf(str1.charAt(j)));
                if(index >= 0){
                    str2.deleteCharAt(index);
                    str1.deleteCharAt(j);
                    j--;
                }
            }
            res = str2.length()+str1.length();
        }

        return res;
//=============================================================================================
        //add code here.
//        int count = 0;
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < a.length(); i++) {
//            char ch = a.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (int i = 0; i < b.length(); i++) {
//            char ch = b.charAt(i);
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) - 1);
//                if (map.get(ch) == 0)
//                    map.remove(ch);
//            } else {
//                count++;
//            }
//        }
//        int c = 0;
//        for (Map.Entry entry : map.entrySet()) {
//            c += (int) entry.getValue();
//        }
//        return count + c;
    }
}
