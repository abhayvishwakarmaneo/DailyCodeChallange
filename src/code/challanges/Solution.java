package code.challanges;

public class Solution {
    public static void main(String[] args) {
        int n = 24;
        int maxPrime = 0;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            maxPrime = n;
        }

        System.out.println(maxPrime);
//====================Above code has less time complexity====================
//====================Another way of solving above problem===================
//        for(int i = 2; i <= n; i++){
//            if(isPrime(i) && (n % i == 0)){
//                maxPrime = i;
//            }
//        }
//        System.out.println(maxPrime);
    }

//    public static boolean isPrime(int num){
//        if(num <= 1)
//            return false;
//
//        for(int i = 2; i <= Math.sqrt(num); i++){
//            if(num % i == 0)
//                return false;
//        }
//
//        return true;
//    }
}
