package gfg.problems.school;

import java.util.Arrays;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(Arrays.toString(find_sum(n)));
    }
    public static int[] find_sum(int n)
    {
        // Code here
        int[] res = new int[2];

        for (int i = 1; i <= n; i++){
            if(i%2 == 0){
                res[1] += i;
            }
            else
                res[0] += i;
        }

        return res;
    }
}