package gfg.problems.school;

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static void main(String[] args) {
        String str = "geeks01for02geeks03!!!";
//        String str = "abcd6746hfufh787744gggg12";
        System.out.println(splitString(str));

//        String[] split = str.split("[^0-9]");
//        int[] nums = new int[split.length];
//        for(int i = 0; i < nums.length; i++){
//            if(!Objects.equals(split[i], ""))
//                nums[i] = Integer.parseInt(split[i]);
//        }
//        Arrays.sort(nums);
//        System.out.println(nums[nums.length-1]);
    }
    static List<String> splitString(String S)
    {
        // code here
        List<String> strList = new ArrayList<>();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for(int i =0; i < S.length(); i++){
            if(Character.isDigit(S.charAt(i)))
                s2 = s2+S.charAt(i);
            else if (Character.isAlphabetic(S.charAt(i)))
                s1 = s1+S.charAt(i);
            else if(!Character.isAlphabetic(S.charAt(i)) && !Character.isDigit(S.charAt(i))){
                s3 = s3+S.charAt(i);
            }
        }

        strList.add(s1);
        strList.add(s2);
        strList.add(s3);
        return strList;
    }
}