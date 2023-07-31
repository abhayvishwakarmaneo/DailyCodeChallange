package code.challanges;

//Given an unsorted integer array containing many duplicate elements,
// rearrange it such that the same element appears together and the relative order of the first occurrence of each element remains unchanged.
//        For example:
//        Input:  { 1, 2, 3, 1, 2, 1 }
//        Output: { 1, 1, 1, 2, 2, 3 }
//
//
//        Input:  { 5, 4, 5, 5, 3, 1, 2, 2, 4 }
//        Output: { 5, 5, 5, 4, 4, 3, 1, 2, 2 }


import java.util.ArrayList;
import java.util.List;

public class CodeChallange31072023 {
    public static void main(String[] args) {
        List<Integer> input = List.of(5, 4, 5, 5, 3, 1, 2, 2, 4);
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < input.size() - 1; i++){
            if(!output.contains(input.get(i))){
                output.add(input.get(i));
                for (int j = i + 1; j < input.size(); j++){
                    if(input.get(i).equals(input.get(j))){
                        output.add(input.get(j));
                    }
                }
            }
        }
        System.out.println(output);
    }
}