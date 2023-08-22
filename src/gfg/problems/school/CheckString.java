package gfg.problems.school;

//Example 1:
//
//        Input:
//        s = "geeks"
//        Output: False
//        Explanation: The string contains different
//        character 'g', 'e', 'k' and 's'.
//
//        Example 2:
//
//        Input:
//        s = "gggg"
//        Output: True
//        Explanation: The string contains only one
//        character 'g'.

public class CheckString {
    public static void main(String[] args) {
        String str = "ggggg";

        System.out.println(check(str));
    }
    static Boolean check (String s)
    {
        // your code here
        Boolean flag = Boolean.TRUE;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                flag = Boolean.FALSE;
                break;
            }
            else
                flag = Boolean.TRUE;
        }

        return flag;
    }
}