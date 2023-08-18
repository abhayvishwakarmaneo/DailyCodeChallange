package gfg.problems;

import java.util.Arrays;

public class SmallerAndLarger {
    static int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int min = 0;
        int max = 0;

        for(int num: arr){
            if(num>x)
                max++;
            else if (num == x) {
                max++;
                min++;
            }
            else
                min++;
        }
        int[] res = {min, max};
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int n = arr.length;
        int x = 10;

        System.out.println(Arrays.toString(getMoreAndLess(arr, n, x)));
    }
}
