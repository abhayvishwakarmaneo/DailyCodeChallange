package gfg.problems.school;

public class ReverseString {
    static String revStr(String S) {
        // code here
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = S.length()-1; i >= 0; i--){
            stringBuilder.append(S.charAt(i));
        }

        String str = stringBuilder.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "BaggeBaggeBilliyan";

        System.out.println(revStr(str));
    }
}
