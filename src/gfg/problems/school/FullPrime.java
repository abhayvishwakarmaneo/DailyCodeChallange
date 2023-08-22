package gfg.problems.school;

public class FullPrime {
    static int fullPrime(int N){
        //code here
        int res = 1;
        if (isPrime(N)){
            while(N != 0){
                int chk = N % 10;
                if(!isPrime(chk)){
                    res = 0;
                    break;
                }
                N /= 10;
            }
        }
        else
            res = 0;

        return res;
    }
    public static boolean isPrime(int n) {
        if (n<= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 37;

        System.out.println(fullPrime(n));
    }
}