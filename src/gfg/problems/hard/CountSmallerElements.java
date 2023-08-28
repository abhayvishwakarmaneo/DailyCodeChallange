package gfg.problems.hard;

import java.util.Arrays;

public class CountSmallerElements {
    public static void main(String[] args) {
        int[] Arr = {12, 1, 2, 3, 0, 11, 4};
        int n = Arr.length;

        System.out.println(Arrays.toString(constructLowerArray(Arr, n)));
    }
    static int[] constructLowerArray(int[] arr, int n) {
        // code here
        int[] res = new int[n];
        int counter = 0;
        for(int i = n-1; i >= 0; i--){
            if(i == n-1)
                res[i] = 0;
            else {
                if(arr[i] > arr[i+1]){
                    counter++;
                }
                res[i]  = counter;
            }
        }

//        for(int i = 0; i < n-1; i++){
//            int counter = 0;
//            for(int j = i+1; j < n; j++){
//                if (arr[i] > arr[j]){
//                    counter++;
//                }
//            }
//            res[i] = counter;
//        }
//        res[n-1] = 0;

        return res;
    }
}
