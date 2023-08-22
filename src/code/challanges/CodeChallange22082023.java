package code.challanges;

import java.util.Arrays;

public class CodeChallange22082023 {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        System.out.println(isAnagram(a, b));
    }
    public static boolean isAnagram(String a,String b)
    {
        // Your code here
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        boolean flag = true;
        Arrays.sort(ca);
        Arrays.sort(cb);

        if(ca.length != cb.length){
            return false;
        }

        for(int i = 0; i< ca.length; i++){
            if(ca[i] != cb[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }
}
