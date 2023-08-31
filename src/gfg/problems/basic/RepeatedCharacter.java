package gfg.problems.basic;

import java.util.HashMap;

public class RepeatedCharacter {
    public static void main(String[] args) {
        String S = "geekforgeek";
        System.out.println(firstRep(S));
    }
    static char firstRep(String S){
        for(int i = 0; i < S.length()-1; i++){
            for(int j = i+1; j < S.length(); j++){
                if(S.charAt(i) == S.charAt(j)){
                    return S.charAt(i);
                }
            }
        }
        return '#';
    }
}