package gfg.problems.basic;

public class CountSquares {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(countSquares(n));
    }

    static int countSquares(int N) {
        // code here
        int counter = 1;
        if (N < 2)
            return 0;

        for (int i = 2; i < Math.sqrt(N); i++) {
            int sqr = i * i;
            if (sqr < N)
                counter++;
            else
                break;
        }
        return counter;
    }
}
