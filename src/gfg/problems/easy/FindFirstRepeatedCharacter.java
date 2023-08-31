package gfg.problems.easy;

import java.util.HashMap;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        String S="geeksforgeeks";
        System.out.println(firstRepChar(S));
    }

    static String firstRepChar(String s)
    {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        String res= "";
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                res = String.valueOf(s.charAt(i));
                break;
            }
            else
                map.put(s.charAt(i), 1);
        }

        return res;
    }
}
