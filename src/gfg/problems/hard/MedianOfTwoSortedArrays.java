package gfg.problems.hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int n = nums1.length;
        int[] nums2 = {2,7};
        int m = nums2.length;

        System.out.println(medianOfArrays(n,m,nums1, nums2));
    }
    static double medianOfArrays(int n, int m, int a[], int b[])
    {
        // Your Code Here
        int[] nums3 = new int[n+m];
        System.arraycopy(a, 0, nums3, 0, n);
        System.arraycopy(b, 0, nums3, n, m);
        Arrays.sort(nums3);
        if (nums3.length % 2 == 0) {
            int n1 = nums3[nums3.length/2];
            int n2 = nums3[(nums3.length/2)-1];
            return (double) (n1+n2) / 2.0;
        } else {
            return (double)nums3[nums3.length/2];
        }
    }
}
