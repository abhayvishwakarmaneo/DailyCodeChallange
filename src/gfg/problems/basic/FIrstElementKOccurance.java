package gfg.problems.basic;

import java.util.HashMap;

public class FIrstElementKOccurance {
    public static void main(String[] args) {
        int[] A = {1, 7, 4, 3, 4, 8, 7};
        int N = A.length;
        int K = 2;

        System.out.println(firstElementKTime(A, N, K));
    }
    public static int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int first = 0;
        if(k == 1){
            return a[0];
        }
        for(int i = 0; i < n; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
                if(map.get(a[i]) == k){
                    first = a[i];
                    break;
                }
            }else
                map.put(a[i], 1);
        }

        return first;
    }
}