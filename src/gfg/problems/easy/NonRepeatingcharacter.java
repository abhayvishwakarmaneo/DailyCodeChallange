package gfg.problems.easy;

import java.util.HashMap;

public class NonRepeatingcharacter {
    public static void main(String[] args) {
        String s = "uhgxusrtgqitrtpiuqxmpdmyumdputxumlxnrnfwgeuslwdysxhucykkmzfdourroagoan";

        System.out.println(nonrepeatingCharacter(s));
    }
    static char nonrepeatingCharacter(String S) {
        char res = '$';
        HashMap<Character, Integer> chars = new HashMap<>();
        for(int i = 0 ; i < S.length(); i++){
            chars.put(S.charAt(i), chars.getOrDefault(S.charAt(i), 0)+1);
        }

        System.out.println(chars);

        for(int j = 0 ; j < S.length(); j++){
            if(chars.get(S.charAt(j)) == 1){
                res = S.charAt(j);
                break;
            }
        }

        return res;
    }
}
