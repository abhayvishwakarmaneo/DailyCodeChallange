package gfg.problems.school;

//Given a stream of incoming numbers, find average or mean of the stream at every point.
//
//        Example 1:
//
//        Input:
//        n = 5
//        arr[] = {10, 20, 30, 40, 50}
//        Output: 10.00 15.00 20.00 25.00 30.00
//        Explanation:
//        10 / 1 = 10.00
//        (10 + 20) / 2 = 15.00
//        (10 + 20 + 30) / 3 = 20.00
//        And so on.
//
//
//        Example 2:
//
//        Input:
//        n = 2
//        arr[] = {12, 2}
//        Output: 12.00 7.00
//        Explanation:
//        12 / 1 = 12.00
//        (12 + 2) / 2 = 7.00

import java.util.Arrays;

public class AverageStream {
    static float[] streamAvg(int[] arr, int n) {
        // code here
        int sum = 0;
        float[] avgList = new float[n];
        for(int i = 0; i < n; i++){
            sum += arr[i];
            avgList[i] = (float) (sum*1.00 )/ (i+1);
        }

        return avgList;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println(Arrays.toString(streamAvg(arr, n)));
    }
}