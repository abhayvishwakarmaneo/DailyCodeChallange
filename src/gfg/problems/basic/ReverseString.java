package gfg.problems.basic;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Geeks";

        System.out.println(reverseWord(s));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >=0; i--){
            sb.append(str.charAt(i));
        }
        return new String(sb);
    }
}
