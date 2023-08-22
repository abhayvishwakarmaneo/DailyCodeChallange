package gfg.daily.problems;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int s = 12;

        System.out.println(subarraySum(arr, n, s));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int sum = 0;
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < n-1; i ++) {
            sum = arr[i];
            if(sum == s){
                index.add(i+1);
                index.add(i+1);
                break;
            }
            for(int j = i+1; j < n; j++) {
                sum+= arr[j];
                if(sum == s){
                    index.add(i+1);
                    index.add(j+1);
                    return index;
                }
            }
        }

        if(index.isEmpty())
            index.add(-1);
        return index;
    }
}
