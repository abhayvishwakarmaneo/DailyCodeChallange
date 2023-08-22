package gfg.problems.school;

public class CompoundIntrest {
    static int getCompundInterest(int P , int T , int N , int R) {
        // code here
        double CI = P * (Math.pow((1 + ((R/100.00)/N)), N * T));
        return (int) CI;
    }

    public static void main(String[] args) {
        int P = 1000 , T = 2 , N = 2 , R = 10;
        System.out.println(getCompundInterest(P, T, N, R));
    }
}
