package gfg.problems.easy;

import java.util.Arrays;

public class RemoveDuplicateElementsArray {
    public static void main(String[] args) {
        int[] Array = {1, 2, 2, 4, 4, 5, 6, 7, 8, 8, 8, 8, 8};
        int n = Array.length;
        System.out.println(remove_duplicate(Array, n));
    }

    static int remove_duplicate(int A[], int N) {
        // code here
        int counter = 0;
        for (int i = 0; i < N; i++) {
            if (A[counter] != A[i]) {
                A[++counter] = A[i];
            }
        }
        System.out.println(Arrays.toString(A));
        return counter;
//=======================Below Code has Time complexity more than above code====================
//        ArrayList<Integer> distinct = new ArrayList<>();
//        for(int i = 0; i < N; i++){
//            if(!distinct.contains(A[i]))
//                distinct.add(A[i]);
//        }
//
//        for(int i = 0; i < distinct.size(); i++){
//            A[i] = distinct.get(i);
//        }
//        return distinct.size();
    }
}