package git.intermediate;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    static BigInteger calFactorial(int n){
        BigInteger fact = BigInteger.valueOf(1);
        if(n == 0){
            return BigInteger.ONE;
        }
        else
        {
            for(int i = n; i >= 1; i--){
                fact = fact.multiply(BigInteger.valueOf(i)) ;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial :");
        int n = sc.nextInt();

        System.out.println(calFactorial(n));
    }
}
