package gfg.problems.basic;

public class StrStr {
    public static void main(String[] args) {
        String str = "abcabcabcd";
        String x = "abcd";

        System.out.println(strstr(str, x));
    }
    static int strstr(String s, String x)
    {
        int index = -1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= s.length()- x.length(); i++){
            for(int j = i; j < x.length()+i; j++){
                sb.append(s.charAt(j));
            }
            if(String.valueOf(sb).equals(x)){
                index = i;
                break;
            }
            sb.delete(0, sb. length());
        }
        return index;
    }
}
