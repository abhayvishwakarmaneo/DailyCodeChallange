package code.challanges;

//Given an array of distinct integers, shuffle it according to the given order of elements.
//        For example:
//        Input:
//        nums[] = { 1, 2, 3, 4, 5 }
//        pos[] = { 3, 2, 4, 1, 0 }
//
//        Output:
//
//        nums[] = { 5, 4, 2, 1, 3 }
//
//        i.e., if pos[i] = j, then update nums[j] = nums[i] for every index i.
//        In other words, update nums[pos[i]] = nums[i] for every index i.


import java.util.Arrays;

public class CodeChallange03082023 {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5};
        int[] pos = { 3, 2, 4, 1, 0 };


//===========Working solution========================

        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[pos[i]] = nums[i];
        }
        System.out.println(Arrays.toString(temp));

// ================Solution on trial===============================================
//        int counter = 0;
//        int tempNum =0;
//        int tempPos = 0;
//
//        while (counter < nums.length) {
//            if(counter == 0){
//                tempNum = nums[pos[counter]];
//                nums[pos[counter]] = nums[counter];
//                tempPos = pos[pos[counter]];
//                pos[pos[counter]] = pos[counter];
//                counter++;
//            }
//            else {
//
//            }
//        }


// ============!Working Solution=======================
//        for(int i = 0; i < nums.length; i++){
//            int tempNum = nums[pos[i]];
//            nums[pos[i]] = nums[i];
//            nums[i] = tempNum;
//            int tempPos = pos[pos[i]];
//            pos[pos[i]] = pos[i];
//            pos[i] = tempPos;
//            System.out.println(Arrays.toString(pos));
//        }
//        System.out.println(Arrays.toString(nums));
//====================================================================

    }
}