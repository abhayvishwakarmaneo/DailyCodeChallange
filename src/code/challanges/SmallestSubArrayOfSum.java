//Given an array of positive integers, find the smallest subarray’s length whose sum of elements is greater than a given number K.
//        For Example:
//        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 20
//        Output: The smallest subarray length is 3
//        Explanation: The smallest subarray with sum > 20 is {6, 7, 8}
//
//        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 7
//        Output: The smallest subarray length is 1
//        Explanation: The smallest subarray with sum > 7 is {8}
//
//        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 21
//        Output: The smallest subarray length is 4
//        Explanation: The smallest subarray with sum > 21 is {4, 5, 6, 7}
//
//        Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 40
//        Output: No subarray exists

import java.util.ArrayList;
import java.util.List;

public class SmallestSubArrayOfSum {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 21;
        int sum = 0;
        boolean flag = false;
        List<Integer> subArr = new ArrayList<>();

        for(int i = input.length-1; i >= 0; i--){
            sum += input[i];
            subArr.add(input[i]);
            if(sum > k){
               flag = true;
               break;
           }
        }

        if (flag)
            System.out.println("The smallest subarray length is "+subArr.size());
        else
            System.out.println("No subarray exists");
    }
}