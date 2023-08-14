package gfg.problems;

import java.util.Arrays;

public class CheckForBinary {
    static boolean isBinary(String str)
    {
        //Your code here
        boolean flag = true;
        char charCheck;
        for (int i = 0; i < str.length(); i++) {
            charCheck = str.charAt(i);
            if (charCheck == '1' || charCheck == '0'){
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }


//=====================Below Code will work better with small numbers====================

//        long num = Long.parseLong(str);
//        boolean flag = true;
//        while(num != 0){
//            long chk = num % 10;
//            if(chk > 1){
//                flag = false;
//                break;
//            }
//            num /= 10;
//        }

        return flag;
    }
    public static void main(String[] args) {
        String str = "1010110001111000111010111101001010100100011101010";
        System.out.println(isBinary(str));
    }
}
