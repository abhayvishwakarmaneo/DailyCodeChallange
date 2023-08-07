package code.challanges;

//Given an integer array, find all distinct combinations of a given length k, where the repetition of elements is allowed.
//        For example,
//        Input:  {1, 2, 3}, k = 2
//        Output: {1, 1}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 3}
//
//        Input:  {1, 2, 3, 4}, k = 2
//        Output: {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 2}, {2, 3}, {2, 4}, {3, 3}, {3, 4}, {4, 4}
//
//        Input:  {1, 2, 1}, k = 2
//        Output: {1, 1}, {1, 2}, {2, 2}

import java.util.HashSet;
import java.util.List;

public class CodeChallange07082023 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int k = 2;
        HashSet<List<Integer>> output = new HashSet<>();

        for(int i = 0; i < input.length; i++){
            for(int j = i; j < input.length; j++){
                if(input[i] < input[j])
                    output.add(List.of(input[i], input[j]));
                else
                    output.add(List.of(input[j], input[i]));
            }
        }
        output.forEach(System.out::println);
    }
}