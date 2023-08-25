package gfg.problems.medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class kadaneAlogorithm {
    static long maxSubarraySum(int arr[], int n){
        int[] sum = new int[n];
        for(int i = 0; i < n-1; i++){
            sum[i] = arr[i];
            for(int j = i; j < n; j++){
                if(j == i){

                }else
                    sum[i] += arr[j];
            }
        }

        Arrays.sort(sum);
        System.out.println(Arrays.toString(sum));
        return sum[n-1];
    }

    public static void main(String[] args) {
        int[] Arr = {-1,-2,-3,-4,-5};
//        Arrays.sort(Arr);
//        System.out.println(Arrays.toString(Arr));
        int n = Arr.length;

        System.out.println(maxSubarraySum(Arr, n));
    }
}