package gfg.problems.easy;

import java.util.HashMap;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(setBits(n));
    }
    static int setBits(int N) {
        // code here
        int counter = 0;
        String binaryString = Integer.toBinaryString(N);
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }
}
