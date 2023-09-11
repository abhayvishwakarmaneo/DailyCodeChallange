package gfg.problems.easy;

import java.util.HashMap;

public class CountPairOfGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int n = arr.length;
        int k = 2;
        System.out.println(getPairsCount(arr, n, k));
    }
    static int getPairsCount(int[] arr, int n, int k) {
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            counter += map.getOrDefault(k-arr[i], 0);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return counter;
    }
}
