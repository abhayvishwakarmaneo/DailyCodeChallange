package gfg.problems.medium;

import java.util.Arrays;
import java.util.Objects;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String address = "0.0.0.0.";

        System.out.println(isValid(address));
    }
    public static boolean isValid(String s) {
        // Write your code here
        boolean flag = true;

        String[] splitAddress = s.split("[.]");
        if(splitAddress.length != 4){
            flag = false;
            return flag;
        }
        for(int i = 0; i < splitAddress.length; i++){
            String chk = splitAddress[i];
            if(chk.equals("") || chk.equals(" ")){
                flag = false;
                return flag;
            }
            char[] charArray = chk.toCharArray();
            if(charArray[0] == '0' && chk.length() > 1)
//            if(chk.length() > 3)
            {
                flag = false;
                break;
            }
            int num = Integer.parseInt(splitAddress[i]);

            if(num < 0 || num > 255){
                flag = false;
                break;
            }
        }

        return flag;
    }
}