package gfg.problems;

//Example 1:
//
//        Input:
//        N = 7
//        A[] = {7, 8, 3, 4, 2, 9, 5}
//        Ouput:
//        5
//        Explanation:
//        In first step '9' would be removed, in 2nd step
//        '2' will be removed, in third step '8' will be
//        removed and so on. So the last remaining
//        element would be '5'.
//
//        Example 2:
//        Input:
//        N = 8
//        A[] = {8, 1, 2, 9, 4, 3, 7, 5}
//        Ouput:
//        4

import java.util.ArrayList;
import java.util.Arrays;

public class RemainingElement {
    public static void main(String[] args) {
        long[] A = {1, 2, 3, 4, 5, 6, 7};
        long N = A.length;

        System.out.println(leftElement(A, N));
    }

    public static long leftElement(long arr[], long n) {
        // Your code goes here
        long remain = 0;
        Arrays.sort(arr);
        ArrayList<Long> numList = new ArrayList<>();
        for(long num: arr){
            numList.add(num);
        }

        long leftCounter = 0;
        long rightCounter = 0;

        if (n % 2 == 0){
            rightCounter = n / 2;
            leftCounter = (n/2)-1;

            while(rightCounter != 0){
                numList.remove(numList.size()-1);
                rightCounter--;
            }
            remain = numList.get(numList.size()-1);
        }
        else {
            rightCounter = leftCounter = n / 2;
            int index = (int) (n - rightCounter)-1;
            remain = numList.get(index);
        }

//=============Below is Another failed solution in time complexity=====================

//        while(rightCounter != 0 && leftCounter != 0){
//            numList.remove(numList.size()-1);
//            rightCounter--;
//            numList.remove(0);
//            leftCounter--;
//        }

//===============greater Time complexity of the below solution===============
//        int leftCounter = 0;
//        int rightCounter = 0;
//
//        while(numList.size() > 1){
//            if(leftCounter == rightCounter){
//                numList.remove(numList.size()-1);
//                rightCounter++;
//            }
//            else if(leftCounter < rightCounter){
//                numList.remove(0);
//                leftCounter++;
//            }
//        }
//============================================================================

//        remain = numList.get(0);

        return remain;
    }
}