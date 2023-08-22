package gfg.problems.school;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractInteger {
    public static void main(String[] args) {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";

        System.out.println(extractIntegerWords(s));
    }
    static ArrayList<String> extractIntegerWords(String s)
    {
        // code here
        ArrayList<String> strList = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
                for(int j = i+1; j < s.length(); j++){
                    if(Character.isDigit(s.charAt(j))){
                        sb.append(s.charAt(j));
                        i++;
                    } else
                        break;
                }
                strList.add(String.valueOf(sb));
            }
        }

        return strList;
    }
}