package gfg.problems.basic;

import java.util.Arrays;

public class CheckIfTwoArraysEqual {
    public static void main(String[] args) {
        long[] A = {1,2,5,4,0};
        long[] B = {2,4,5,0,1};
        int n = A.length;

        System.out.println(check(A, B, n));
    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Boolean flag = true;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0 ; i < N; i++){
            if(A[i] != B[i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
