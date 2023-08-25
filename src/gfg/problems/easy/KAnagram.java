package gfg.problems.easy;

import java.util.Arrays;

public class KAnagram {
    public static void main(String[] args) {
        String str1 = "uovwhqfaemqodyksjj", str2="swwhzsiowocjfyadvj";
        int k = 2;

        System.out.println(areKAnagrams(str1, str2, k));
    }
    static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        boolean flag = true;
        int counter = 0;
        if(s1.length() != s2.length()){
            return false;
        }else {
            char[] s1CharArray = s1.toCharArray();
            char[] s2charArray = s2.toCharArray();
            Arrays.sort(s1CharArray);
            Arrays.sort(s2charArray);
            System.out.println(s1CharArray);
            System.out.println(s2charArray);
            for(int i = 0; i < s1CharArray.length; i++){
                if(s1CharArray[i] != s2charArray[i])
                    counter++;
            }

            if(counter != k)
                flag = false;
        }

        return flag;
    }
}
