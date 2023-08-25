package gfg.problems.basic;

public class StrStr {
    public static void main(String[] args) {
        String str = "ababaaaaaa";
        String x = "abaa";

        System.out.println(strstr(str, x));
    }
    static int strstr(String s, String x)
    {
        //Your code here
        int res = -1;
        int counter = 0;
        for(int i = 0; i < s.length()-x.length(); i++){
            String substring = s.substring(i, i + (x.length() - 1));
            if(substring.equals(x)){
                counter++;
            }
        }

        if(counter > 0){
            return counter;
        }
        return res;
    }
}
