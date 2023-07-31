// Merge two arrays by satisfying given constraints
// Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
// Input:
 
// X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
// Y[] = { 1, 8, 9, 10, 15 }
 
// The vacant cells in X[] is represented by 0

// Output:
 
// X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] x = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] y = { 1, 8, 9, 10, 15 };
        int[] z = new int[x.length+y.length];

        System.arraycopy(y, 0, z, 0, y.length);

        for(int j = 0; j < x.length; j++){
            if(x[j] != 0){
                z[j+y.length] = x[j];
            }
        }

        Arrays.sort(z);
        for (int k:z) {
            System.out.println(k);
        }
    }
}
