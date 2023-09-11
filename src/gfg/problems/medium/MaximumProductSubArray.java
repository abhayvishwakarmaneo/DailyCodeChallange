package gfg.problems.medium;

import java.util.ArrayList;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int n = arr.length;
        System.out.println(maxProduct(arr, n));
    }

    static long maxProduct(int[] arr, int n) {
        long maxProduct = arr[0];
        for (int i = 0; i < n; i++) {
            long product = arr[i];
            if (i == n - 1) {
                if (maxProduct < product)
                    maxProduct = product;

                break;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0)
                    break;

                product *= arr[j];
                if (maxProduct < product)
                    maxProduct = product;
            }

        }

        return maxProduct;
    }
}
