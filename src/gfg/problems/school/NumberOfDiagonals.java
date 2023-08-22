package gfg.problems.school;

import java.util.ArrayList;

public class NumberOfDiagonals {
    public static long diagonals(int n)
    {
        //code here.

        long num = n;
        long output = (num*(num-3))/2 ;
        return output;
    }

    public static void main(String[] args) {
        int n = 1000000000;
        System.out.println(diagonals(n));
    }
}
