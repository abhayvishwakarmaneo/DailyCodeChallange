package gfg.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramString {
    public static void main(String[] args) {
        String S = "Pack mY box witH fIve dozen liquor jugs";

        System.out.println(isPanagram(S));
    }

    static int isPanagram(String S) {
        Map<Character, Integer> alphabets = new HashMap<>();
        for (Object[] data : new Object[][]{
                {'A', 0}, {'B', 0}, {'C', 0}, {'D', 0}, {'E', 0}, {'F', 0}, {'G', 0}, {'H', 0}, {'I', 0},
                {'J', 0}, {'K', 0}, {'L', 0}, {'M', 0}, {'N', 0}, {'O', 0}, {'P', 0}, {'Q', 0}, {'R', 0},
                {'S', 0}, {'T', 0}, {'U', 0}, {'V', 0}, {'W', 0}, {'X', 0}, {'Y', 0}, {'Z', 0}
        }) {
            if (alphabets.put((Character) data[0], (Integer) data[1]) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        int flag = 1;

        for(int i = 0; i < S.length(); i++){
            if(alphabets.containsKey(Character.toUpperCase(S.charAt(i)))){
                alphabets.put(Character.toUpperCase(S.charAt(i)), alphabets.get(Character.toUpperCase(S.charAt(i))) + 1);
            }
        }

        for (int value : alphabets.values()) {
            if(value < 1){
                flag = 0;
                break;
            }
        }

        return flag;
    }
}
