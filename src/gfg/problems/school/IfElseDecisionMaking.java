package gfg.problems.school;

public class IfElseDecisionMaking {
    static String compareFive(int N){
        // code here
        String str ="";
        if(N > 5)
            str = "Greater than 5";
        else if (N == 5) {
            str = "Equal to 5";
        }
        else
            str = "Less than 5";

        return str;
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println(compareFive(n));
    }
}