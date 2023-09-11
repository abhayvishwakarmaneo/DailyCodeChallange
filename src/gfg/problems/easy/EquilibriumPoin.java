package gfg.problems.easy;

import java.util.Arrays;

public class EquilibriumPoin {
    public static void main(String[] args) {
        long[] A = {1};
        int n = A.length;
        System.out.println(equilibriumPoint(A, n));
    }
    public static int equilibriumPoint(long[] arr, int n) {
        long[] leftArr = new long[n];
        long[] rightArr = new long[n];
        long leftSum = 0;
        long rightSum = 0;

        for(int i = 0; i < n ; i++){
            leftSum+= arr[i];
            leftArr[i] = leftSum;
        }

        for(int j = n-1; j >= 0 ; j--){
            rightSum+= arr[j];
            rightArr[j] = rightSum;
        }

        for(int k = 0; k < n ; k++){
            if(leftArr[k] == rightArr[k])
                return k+1;
        }
        return -1;
    }
}
