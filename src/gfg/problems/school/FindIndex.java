package gfg.problems;

import java.util.Arrays;

public class FindIndex {
    static int[] findIndex(int a[], int N, int key)
    {
        //code here.
        int[] output = new int[2];
        for(int i = 0; i < N; i++){
            if(a[i] == key){
              output[0] = i;
                break;
            }
            else
                output[0] = -1;
        }
        for(int j = N-1; j >= 0; j--){
            if(a[j] == key){
                output[1] = j;
                break;
            }
            else
                output[1] = -1;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 5 };
        int n = 6;
        int k = 7;

        System.out.println(Arrays.toString(findIndex(a, n, k)));


    }
}