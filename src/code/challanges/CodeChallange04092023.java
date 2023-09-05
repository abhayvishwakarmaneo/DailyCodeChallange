package code.challanges;

//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
//Note: If at any instance, there are no more subarrays of size greater than or equal to K,
// then reverse the last subarray (irrespective of its size). You shouldn't return any array,
// modify the given array in-place.
//
//        Example 1:
//        Input:
//        N = 5, K = 3
//        arr[] = {1,2,3,4,5}
//        Output: 3 2 1 5 4
//        Explanation: First group consists of elements
//        1, 2, 3. Second group consists of 4,5.
//
//        Example 2:
//        Input:
//        N = 4, K = 3
//        arr[] = {5,6,8,9}
//        Output: 8 6 5 9
//
//        Example 3:
//        Input:
//        N = 10, K = 3
//        arr[] = {1,2,3,4,5,6,7,8,9,10}
//        Output: 3 2 1 6 5 4 9 8 7 10
//        Explanation: First group consists of elements
//        1, 2, 3. Second group consists of 4,5,6. Third Group consist of 7,8,9 and the last group had only 10.

import java.util.ArrayList;
import java.util.Stack;

public class CodeChallange04092023 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);arr.add(6);
        arr.add(7);arr.add(8);arr.add(9);arr.add(10);arr.add(11);arr.add(70);arr.add(0);
        int n = arr.size();
        int k = 3;

        CodeChallange04092023 obj = new CodeChallange04092023();
        obj.reverseInGroups(arr, n, k);

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str.append(arr.get(i) + " ");
        }
        System.out.println(str);
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int loopCount = n / k + 1;
        ArrayList<Stack<Integer>> lists = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int x = 0;
        for (int i = 0; i < loopCount; i++) {
            for (int j = 0; j < k; j++) {
                if (x < n) {
                    stack.push(arr.get(x));
                    x++;
                }
            }
            lists.add((Stack<Integer>) stack.clone());
            stack.clear();
        }

        arr.clear();
        for (int i = 0; i < lists.size(); i++) {
            while (!lists.get(i).empty()) {
                arr.add(lists.get(i).pop());
            }
        }
    }
}