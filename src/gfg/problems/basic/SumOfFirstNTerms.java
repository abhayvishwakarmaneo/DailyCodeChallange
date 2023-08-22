package gfg.problems.basic;

public class SumOfFirstNTerms {
    public static void main(String[] args) {
        long N= 5;
        System.out.println(sumOfSeries(N));
    }

    static long sumOfSeries(long N) {
        // code here
        long sum = 0;
        for(int i = 1; i <= N; i++){
            sum += Math.pow(i, 3);
        }
        return sum;
    }
}