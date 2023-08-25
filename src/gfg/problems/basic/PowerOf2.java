package gfg.problems.basic;

import java.util.ArrayList;

public class PowerOf2 {
    public static void main(String[] args) {
        long n = 20;
        System.out.println(isPowerofTwo(n));
    }
    public static boolean isPowerofTwo(long n){
        long num = n;
        boolean flag = false;
        ArrayList<Integer> pow = new ArrayList<>();

        if(n == 1 || n == 2)
            return true;

        if(n % 2 != 0)
            return flag;

        else {
            while (n > 1){
                n = n/2;
                pow.add(2);
            }
        }
        if(Math.pow(2, pow.size()) == num)
            flag = true;

        return flag;
    }
}
