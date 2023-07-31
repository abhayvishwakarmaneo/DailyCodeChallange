//Find Majority element (Boyer-Moore Majority vote Algorithm)
//        Given an integer array containing duplicates, return the majority element if present.
//        A majority element appears more than n/2 times, where n is the array size.
//        For example, the majority element is 2 in array {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2}.
//        output: {2, 2, 2, 2, 2, 2}

import java.util.ArrayList;

public class MajorityVote {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 2, 2, 5, 2, 3, 1, 2, 2, 2};
        int num = 0;
        int counter = 1;
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j])
                    counter ++;
            }
            if(counter > (arr.length/2)){
                num = arr[i];
                break;
            }
        }

        for (int k = 0; k < counter; k++)
            output.add(num);

        System.out.println(output);
    }
}