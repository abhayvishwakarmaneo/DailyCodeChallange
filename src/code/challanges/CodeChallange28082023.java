package code.challanges;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeChallange28082023 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }

    public static boolean checkIfPangram(String sentence) {

        Set<Character> characters = new TreeSet<>();
        boolean flag = true;
        for (char ch : sentence.toCharArray()) {
            characters.add(ch);
        }
        if(characters.size() != 26){
            flag = false;
        }
        return flag;
//======================Below program has more time complexity than the above program==========================
//        Map<Character, Integer> alphabets = Stream.of(new Object[][] {
//                { 'A', 0},{ 'B', 0},{ 'C', 0},{ 'D', 0},{ 'E', 0},{ 'F', 0},{ 'G', 0},{ 'H', 0}, { 'I', 0},
//                { 'J', 0},{ 'K', 0},{ 'L', 0},{ 'M', 0},{ 'N', 0},{ 'O', 0},{ 'P', 0}, { 'Q', 0}, { 'R', 0},
//                { 'S', 0},{ 'T', 0},{ 'U', 0},{ 'V', 0},{ 'W', 0},{ 'X', 0},{ 'Y', 0},{ 'Z', 0}
//        }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));
//        boolean flag = true;
//
//        for(int i = 0; i < sentence.length(); i++){
//            if(alphabets.containsKey(Character.toUpperCase(sentence.charAt(i)))){
//                alphabets.put(Character.toUpperCase(sentence.charAt(i)), alphabets.get(Character.toUpperCase(sentence.charAt(i))) + 1);
//            }
//        }
//
//        for (int value : alphabets.values()) {
//            if(value < 1){
//                flag = false;
//                break;
//            }
//        }
//
//        return flag;
    }
}
