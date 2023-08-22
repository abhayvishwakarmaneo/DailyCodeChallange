package gfg.problems.school;

public class nPr {
    public static void main(String[] args) {
        long n = 3, r = 3;

        System.out.println(nPr(n,r));
    }
    static long nPr(long n, long r){
        // code here
        long res = 0;
        long up = factorial(n);
        long down = factorial(n-r);
        res = up/down;
        return res;
    }
    static long factorial(long n){
        long fact = 1;
        if(n == 0)
            return fact;
        while(n >= 1){
            fact*=n;
            n--;
        }
        return fact;
    }
}