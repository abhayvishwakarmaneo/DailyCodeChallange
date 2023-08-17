package code.challanges;

//Given an integer array having distinct elements, find the surpasser count for each element in it.
// In other words, for each array element, find the total number of elements to its right,
// which are greater than it.
//        For example:
//        Input:  { 4, 6, 3, 9, 7, 10 }
//
//        Output: { 4, 3, 3, 1, 1, 0 }


import java.util.Arrays;

public class CodeChallange17082023 {
    public static void main(String[] args) {
        int[] input = {4, 6, 3, 9, 7, 10};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length - 1; i++) {
            int counter = 0;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    counter++;
                }
                if (j == input.length - 1) {
                    output[i] = counter;
                }
            }
        }
        output[input.length - 1] = 0;
        System.out.println(Arrays.toString(output));
    }
}