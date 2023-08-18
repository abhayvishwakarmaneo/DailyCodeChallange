package gfg.problems;

public class SeriesAP {
    static int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int diff = A2 - A1;
        int res = A2 + ((N - 2)*diff);

        return res;
    }

    public static void main(String[] args) {
        int a1 = 1;
        int a2 = 5;
        int n = 5;

        System.out.println(nthTermOfAP(a1,a2, n));
    }
}