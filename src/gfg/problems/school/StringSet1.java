package gfg.problems;

//Example 1:
//
//        Input: S1 = "Geeks" , S2 = "forGeeks"
//        Output: "skeeGrofskeeG"
//        Explanation: Concatenating S1 and S2 to
//        get "GeeksforGeeks" then reversing it to
//        "skeeGrofskeeG".
//        Example 2:
//
//        Input: S1 = "Practice" , S2 = "Geeks"
//        Output: "skeeGecitcarP"
//        Explanation: Concatenating S1 and S2 to
//        get "PracticeGeeks" then reversing it to
//        "skeegecitcarP".

public class StringSet1 {
    static String conRevstr(String S1, String S2) {
        // code here
        String s3 = S1+S2;
        StringBuilder resString = new StringBuilder();
        for(int i = s3.length()-1; i >= 0; i--){
            resString.append(s3.charAt(i));
        }

        String res = resString.toString();
        return res;
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "forFeeks";

        System.out.println(conRevstr(s1,s2));
    }
}