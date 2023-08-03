package code.challanges;

//Write code to print all combinations of positive integers in increasing order that sum to a given positive number.
//        For Example:
//        Input:  N = 3
//
//        1 1 1
//        1 2
//        3
//
//        Input:  N = 4
//
//        1 1 1 1
//        1 1 2
//        1 3
//        2 2
//        4
//
//        Input:  N = 5
//
//        1 1 1 1 1
//        1 1 1 2
//        1 1 3
//        1 2 2
//        1 4
//        2 3
//        5


import java.util.Arrays;
import java.util.stream.Collectors;

public class CodeChallange02082023 {

    public static void calculateCombinations(int[] arr, int startIndex, int sum, int sumLeft)
    {
        int prevNum = (startIndex > 0) ? arr[startIndex - 1] : 1;
        for (int j = prevNum; j <= sum; j++) {
            arr[startIndex] = j;
            if (sumLeft > j) {
                calculateCombinations(arr, startIndex + 1, sum, sumLeft - j);
            }

            if (sumLeft == j) {
                System.out.println(Arrays.stream(arr).limit(startIndex + 1).boxed()
                        .collect(Collectors.toList()));
            }
        }
    }

    public static void findCombination(int sum){
        int[] arr = new int[sum];

        int startingIndex = 0;
        calculateCombinations(arr, startingIndex, sum, sum);
    }

    public static void main(String[] args) {
        int n = 4;
        findCombination(n);
    }
}