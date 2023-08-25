package gfg.problems.easy;

public class PallindromeString {
    public static void main(String[] args) {
        String s = "bhubb";
        System.out.println(isPalindrome(s));
    }
    static int isPalindrome(String S) {
        // code here
        int res = 1;
        String str = "";
        StringBuilder sb = new StringBuilder();
        for(int i = S.length()-1; i >= 0; i-- ){
            sb.append(S.charAt(i));
        }
        str = String.valueOf(sb);
        if(!S.equals(str))
            res = 0;

        return res;
    }
}
