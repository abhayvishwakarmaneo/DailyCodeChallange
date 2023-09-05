package gfg.problems.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseArrayIngroup {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
//        arr.add(36);arr.add(93);arr.add(64);arr.add(48);arr.add(96);arr.add(55);arr.add(70);arr.add(0);
//        arr.add(82);
//        arr.add(30);arr.add(16);arr.add(22);arr.add(38);arr.add(53);arr.add(19);arr.add(50);arr.add(91);
//        arr.add(43);arr.add(70);arr.add(88);arr.add(10);arr.add(57);arr.add(14);arr.add(94);arr.add(13);
//        arr.add(36);arr.add(59);arr.add(32);arr.add(54);arr.add(58);arr.add(18);arr.add(82);arr.add(67);
        int n = arr.size();
        int k = 3;

        ReverseArrayIngroup obj = new ReverseArrayIngroup();
        obj.reverseInGroups(arr, n, k);

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str.append(arr.get(i) + " ");
        }
        System.out.println(str);
    }

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
//        ArrayList<List<Integer>> lists = new ArrayList<>();
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
