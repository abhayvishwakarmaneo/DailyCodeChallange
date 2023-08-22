package gfg.problems.school;

import java.util.ArrayList;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        int N = 5;
        int[] Arr = {1, 2, 3, 4, 5};

        System.out.println(EvenOddSum(N, Arr));
    }

    static ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 != 0) {
                oddSum += Arr[i];
            }
            if ((i + 1) % 2 == 0) {
                evenSum += Arr[i];
            }
        }

        res.add(oddSum);
        res.add(evenSum);

        return res;
    }
}