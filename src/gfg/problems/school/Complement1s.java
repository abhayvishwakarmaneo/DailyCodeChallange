package gfg.problems.school;

public class Complement1s {
    public static void main(String[] args) {
        String s = "101";
        int n = s.length();

        System.out.println(onesComplement(s, n));
    }
    static String onesComplement(String S,int N){
        //code here
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < N; i++){
            if(S.charAt(i) == '1'){
                sb.append("0");
            }
            else
                sb.append("1");
        }
        return new String(sb);
    }
}