package gfg.problems;

import java.util.Arrays;

public class PerfectArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        int n = a.length;

        if(IsPerfect(a, n))
            System.out.println("PERFECT");
        else
            System.out.println("NOT PERFECT");

    }

    public static boolean IsPerfect(int[] a, int n)
    {
        // Complete the function
        boolean flag = true;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = a[n - i -1];
        }

        for(int j = 0; j < n; j++){
            if(arr[j] == a[j]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }

        return flag;
    }
}