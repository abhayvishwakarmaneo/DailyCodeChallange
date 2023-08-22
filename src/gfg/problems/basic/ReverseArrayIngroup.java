package gfg.problems.basic;

import java.util.ArrayList;

public class ReverseArrayIngroup {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(36);
        arr.add(93);
        arr.add(64);
        arr.add(48);
        arr.add(96);arr.add(55);arr.add(70);arr.add(0);
        arr.add(82);
        arr.add(30);arr.add(16);arr.add(22);arr.add(38);arr.add(53);arr.add(19);arr.add(50);arr.add(91);
        arr.add(43);arr.add(70);arr.add(88);arr.add(10);arr.add(57);arr.add(14);arr.add(94);arr.add(13);
        arr.add(36);arr.add(59);arr.add(32);arr.add(54);arr.add(58);arr.add(18);arr.add(82);arr.add(67);
        int n = arr.size();
        int k = 13;

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
        ArrayList<Integer> list = new ArrayList<>();
        if (k < n) {
            for (int i = k - 1; i >= 0; i--) {
                list.add(arr.get(i));
            }
            for (int j = n - 1; j >= k; j--) {
                list.add(arr.get(j));
            }
            for (int m = 0; m < n; m++) {
                arr.remove(m);
                arr.add(m, list.get(m));
            }
        }else {
            for (int i = n - 1; i >= 0; i--) {
                list.add(arr.get(i));
            }
            for (int m = 0; m < n; m++) {
                arr.remove(m);
                arr.add(m, list.get(m));
            }
        }
    }
}
