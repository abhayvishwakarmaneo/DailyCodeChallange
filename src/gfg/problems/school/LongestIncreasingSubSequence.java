package gfg.problems;

public class LongestIncreasingSubSequence {

    static int longestSubsequence(int size, int a[])
    {
        // code here
        int counter = 1;
        int prevNum = 0;
        int currNum = 0;

        for (int i =0; i < size-1; i++) {
            if(a[i] < a[i+1]){
                counter++;
                prevNum = a[i];
                currNum = a[i+1];
            }

        }

        return counter;
    }

    public static void main(String[] args) {
        int n = 16;
        int[] arr = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

        System.out.println(longestSubsequence(n, arr));
    }
}
