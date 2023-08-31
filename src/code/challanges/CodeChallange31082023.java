package code.challanges;

//Given two strings S1 and S2 in lowercase, the task is to make them anagram.
// The only allowed operation is to remove a character from any string.
// Find the minimum number of characters to be deleted to make both the strings anagram.
//Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.
//
//        Example 1:
//
//        Input:
//        S1 = bcadeh
//        S2 = hea
//        Output: 3
//        Explanation: We need to remove b, c
//        and d from S1.
//        Example 2:
//
//        Input:
//        S1 = cddgk
//        S2 = gcd
//        Output: 2
//        Explanation: We need to remove d and
//        k from S1.

public class CodeChallange31082023 {
    public static void main(String[] args) {
        String s1 = "cddgk";
        String s2 = "gcd";

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
    }
}