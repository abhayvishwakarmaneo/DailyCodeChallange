package gfg.problems;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        long n = sc.nextLong();
        long rev = 0;

        while(n != 0){
            long sum = n % 10;
            n /= 10;
            rev = (rev*10)+sum ;
        }
        System.out.println("Reverse of given number "+rev);
    }
}