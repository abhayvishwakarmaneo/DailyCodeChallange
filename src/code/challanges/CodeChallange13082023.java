package code.challanges;

//Given a number N. Your task is to check whether it is fascinating or not.
//Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3,
//and when both these products are concatenated with the original number,
// then it results in all digits from 1 to 9 present exactly once.
//        Example 1:
//
//        Input:
//        N = 192
//        Output: Fascinating
//        Explanation: After multiplication with 2
//        and 3, and concatenating with original
//        number, number will become 192384576
//        which contains all digits from 1 to 9.
//        Example 2:
//
//        Input:
//        N = 853
//        Output: Not Fascinating
//        Explanation: It's not a fascinating
//        number.

import java.util.HashMap;

public class CodeChallange13082023 {
    public static void main(String[] args) {
        int n = 192;

        if(fascinating(n))
            System.out.println("Fascinating");
        else
            System.out.println("Not Fascinating");
    }
    static boolean fascinating(long n) {
        // code here
        long mul2 = n*2;
        long mul3 = n*3;
        boolean flag = true;

        String str = String.valueOf(n)+ mul2 +mul3;
        if(str.length()>9 || str.length()<9){
            flag = false;
            return flag;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 1; i <= 9; i++){
            char c = (char) (i + '0');
            map.put(c, 0);
        }

        for(int j = 0; j < str.length(); j++ ){
            char ch = str.charAt(j);
            if(ch >= '1' && ch <= '9')
                map.put(ch, map.get(ch)+1);
        }

        for(int k = 1; k <= 9; k++){
            if(map.containsValue(0)){
                flag = false;
                break;
            }
            else
                flag = true;
        }

        return flag;
    }
}