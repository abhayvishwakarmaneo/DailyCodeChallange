package gfg.problems.school;

//Given N,  reverse the digits of N.
//        Example 1:
//
//        Input: 200
//        Output: 2
//        Explanation: By reversing the digts of
//        number, number will change into 2.
//        Example 2:
//
//        Input : 122
//        Output: 221
//        Explanation: By reversing the digits of
//        number, number will change into 221.

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