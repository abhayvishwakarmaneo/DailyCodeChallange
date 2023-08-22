package gfg.problems.easy;

//Given an array a of size N which contains elements from 0 to N-1,
// you need to find all the elements occurring more than once in the given array.
// Return the answer in ascending order. If no such element is found, return list containing [-1].
//
//        Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.
//
//        Example 1:
//
//        Input:
//        N = 4
//        a[] = {0,3,1,2}
//        Output:
//        -1
//        Explanation:
//        There is no repeating element in the array. Therefore output is -1.
//        Example 2:
//
//        Input:
//        N = 5
//        a[] = {2,3,1,2,3}
//        Output:
//        2 3
//        Explanation:
//        2 and 3 occur more than once in the given array.

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] a = {7 ,6 ,8 ,4 ,9 ,8 ,4 ,7 ,4 ,4};
        int n = a.length;

        System.out.println(duplicates(a, n));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> newList = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                if(newList.isEmpty())
                    newList.add(arr[i]);
                else {
                    if(arr[i] != newList.get(newList.size()-1)){
                        newList.add(arr[i]);
                    }
                }
            }
        }
        if(newList.isEmpty())
            newList.add(-1);

        return newList;
    }
}