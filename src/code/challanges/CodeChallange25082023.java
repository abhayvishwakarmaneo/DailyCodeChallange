package code.challanges;

//Given an array of positive and negative integers, segregate them in linear time and constant space.
// The output should print all negative numbers, followed by all positive numbers.
//        For example:
//        Input:  [9, -3, 5, -2, -8, -6, 1, 3]
//        Output: [-3, -2, -8, -6, 5, 9, 1, 3]


import java.util.Arrays;

public class CodeChallange25082023 {
    public static void main(String[] args) {
        int[] arr = {9, -3, 5, -2, -8, -6, 1, 3};
        System.out.println(Arrays.toString(seperate(arr)));
    }

//===========Time Complexity for both Solution is O(1)=======================================
//===========================================================================================
//================Output for the below Code is ==============================================
//================[-3, -2, -8, -6, 5, 9, 1, 3]===============================================
    static int[] seperate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int k = i + 1;
        while(k < n){
            if (arr[i] < 0 && arr[k] < 0) {
                i+=2;
                k+=2;
            } else if (arr[i] > 0 && arr[k] < 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            } else if (arr[i] > 0 && arr[k] > 0) {
                k++;
            } else {
                i++;
                k++;
            }
        }
        return arr;
    }
//===========================================================================================
//================Output for the below Code is ==============================================
//================[-6, -3, -8, -2, 5, 9, 1, 3]===============================================
//    static int[] seperate(int[] arr) {
//        int n = arr.length;
//        int i = 0;
//        int k = n - 1;
//        while (i <= n / 2 && k >= n / 2) {
//            if (arr[i] < 0 && arr[k] < 0) {
//                i++;
//            } else if (arr[i] > 0 && arr[k] < 0) {
//                int temp = arr[i];
//                arr[i] = arr[k];
//                arr[k] = temp;
//                i++;
//                k--;
//            } else if (arr[i] > 0 && arr[k] > 0) {
//                k--;
//            } else {
//                i++;
//                k--;
//            }
//        }
//        return arr;
//    }
}