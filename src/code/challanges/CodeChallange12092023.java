package code.challanges;

import java.util.*;
import java.util.stream.IntStream;

public class CodeChallange12092023 {
    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15};
        int n = arr.length;
        int k = 3;
        System.out.println(kthSmallest(arr, 0, n-1, k));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {


//        Queue<Integer> queue = new PriorityQueue<>();
////        while(l < r){
////            queue.add(arr[l]);
////            l++;
////        }
//
//        for(int i = 0; i < k-1; i++){
//            queue.poll();
//        }
//
//        res = queue.poll();

        return Arrays.stream(arr).sorted().limit(k).max().getAsInt();
    }
}
