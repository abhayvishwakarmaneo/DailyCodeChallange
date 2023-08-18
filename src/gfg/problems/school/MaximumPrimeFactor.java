package gfg.problems;

//Find the maximum prime factor of a given number

public class MaximumPrimeFactor {
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
    }
}
