package gfg.problems.school;

import java.util.Scanner;

public class TypeOfCharacters {
    public static void main(String[] args) {
        String str = "#GeeKs01fOr@gEEks07";

        System.out.println(count(str));

        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
    }
    static int[] count (String s)
    {
        // your code here
        StringBuilder digits = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.append(s.charAt(i));
            } else if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))) {
                specialChar.append(s.charAt(i));
            } else if (Character.isAlphabetic(s.charAt(i))) {
                if(s.charAt(i) == Character.toUpperCase(s.charAt(i))){
                    upperCase.append(s.charAt(i));
                } else if (s.charAt(i) == Character.toLowerCase(s.charAt(i))) {
                    lowerCase.append(s.charAt(i));
                }
            }
        }
        int[] res = new int[4];
        res[0] = upperCase.length();
        res[1] = lowerCase.length();
        res[2] = digits.length();
        res[3] = specialChar.length();

        return res;
    }
}