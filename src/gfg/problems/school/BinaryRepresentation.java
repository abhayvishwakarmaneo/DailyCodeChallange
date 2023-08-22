package gfg.problems.school;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(getBinaryRep(n));
    }
    static String getBinaryRep(int N){
        // code here
        String sb = Integer.toBinaryString(N);
         if(sb.length() < 30){
             for(int i = sb.length(); i < 30; i++){
                 sb = "0"+sb;
             }
         }

        return sb;
    }

}