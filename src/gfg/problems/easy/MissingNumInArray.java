package gfg.problems.easy;

import java.util.Arrays;

public class MissingNumInArray {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {2, 3, 4, 1, 6, 7};

        System.out.println(missingNumber(arr, n));
    }
    static int missingNumber(int[] array, int n) {
        // Your Code Here
        Arrays.sort(array);
        int miss = -1;
        for(int i = 0; i< n-1; i++){
            if(array[i] != i+1){
                miss = i+1;
                break;
            }
        }
        if(miss == -1){
            miss = n;
        }
        return miss;
    }
}
