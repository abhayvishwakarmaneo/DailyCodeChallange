package gfg.problems.basic;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;

        System.out.println(thirdLargest(arr, n));
    }
    static int thirdLargest(int a[], int n)
    {
        // Your code here
        Arrays.sort(a);
        int last3 = 0;
        int secondLargest = 0;
        for(int i = n-1 ; i>= 0; i-- ){
            if(a[i] < a[n-1]){
                secondLargest = a[i];
                break;
            }
        }
        for(int i = n-1 ; i>= 0; i-- ){
            if(a[i] < secondLargest){
                last3 = a[i];
                break;
            }
        }
        return last3;
    }
}
