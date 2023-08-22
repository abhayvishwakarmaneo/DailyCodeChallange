package gfg.problems.school;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] A = {1,2,3,7,5};
        int N = A.length;
        int S = 50;


        System.out.println(subarraySum(A, N, S));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == s) {
                res.add(1);
                res.add(i + 1);
                return res;
            }

            if (prefixSumMap.containsKey(sum - s)) {
                res.add(prefixSumMap.get(sum - s) + 1);
                res.add(i + 1);
                return res;
            }

            prefixSumMap.put(sum, i + 1);
        }

        res.add(-1);
        return res;
    }
}