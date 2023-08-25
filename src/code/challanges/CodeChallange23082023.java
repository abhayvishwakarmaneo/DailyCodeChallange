package code.challanges;

import java.util.Arrays;

public class CodeChallange23082023 {
    public static void main(String[] args) {
        int[] Arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int n = Arr.length;
        int k = 5;

        System.out.println(getMinDiff(Arr, n, k));
    }

    static int getMinDiff(int[] arr, int n, int k) {
        // code here
        int res = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if (arr[i] < 0 || arr[i] - k < 0){
                arr[i] += k;
            }
            else {
                arr[i] -= k;
            }
        }
        Arrays.sort(arr);
        return arr[n-1] - arr[0];
    }
}
