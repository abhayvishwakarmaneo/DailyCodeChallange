package gfg.problems;

import java.util.Arrays;

public class NthFibonacciSeries {
    static int nthFibonacci(int n) {
        // code here
        int[] arr = new int[n + 1];
        int modulo = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                arr[i] = 0;
            else if (i == 1)
                arr[i] = 1;
            else {
                arr[i] = (arr[i - 2] + arr[i - 1]) % modulo;
            }
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 14521;
        System.out.println(nthFibonacci(n));
    }
}
