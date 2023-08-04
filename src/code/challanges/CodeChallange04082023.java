package code.challanges;

//Given an integer array, determine whether it can be divided into pairs such that the sum of elements in each pair is divisible by a given positive integer k.
//        For Example
//        Input:
//        arr[] = { 3, 1, 2, 6, 9, 4 }
//        k = 5
//   -->  Output: Pairs can be formed
//        Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.
//
//        Input:
//        arr[] = { 2, 9, 4, 1, 3, 5 }
//        k = 6
//   -->  Output: Pairs can be formed
//        Explanation: Array can be divided into pairs {(2, 4), (9, 3), (1, 5)} where the sum of elements in each pair is divisible by 6.
//
//
//        Input:
//        arr[] = { 3, 1, 2, 6, 9, 4 }
//        k = 6
//   -->  Output: Pairs cannot be formed
//        Explanation: Array cannot be divided into pairs where the sum of elements in each pair is divisible by 6.


import java.util.ArrayList;
import java.util.List;

public class CodeChallange04082023 {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 4, 1, 3, 5 };
        int k = 6;
        List<List<Integer>> pairs = new ArrayList<>();

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if((arr[i] + arr[j]) % k == 0){
                    pairs.add(List.of(arr[i],arr[j]));
                }
            }
        }

        if(pairs.isEmpty())
            System.out.println("Array cannot be divided into pairs where the sum of elements in each pair is divisible by "+k);
        else{
            System.out.println("Pairs can be formed");
            System.out.print("Array can be divided into pairs "+pairs);
        }

    }
}