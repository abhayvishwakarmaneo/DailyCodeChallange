package gfg.problems.easy;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
    static String reverseWords(String S)
    {
        // code here
        String[] stringSplitArr = S.split("[.]");
        String str = "";
        for(int i = stringSplitArr.length-1; i >= 0 ; i--){
            if (i == 0) {
                str += stringSplitArr[i];
            }else
                str += stringSplitArr[i]+".";
        }
        return  str;
    }
}
