package gfg.problems.school;

import java.util.ArrayList;

//Given a number N, find the Nth term in the series 1, 3, 6, 10, 15, 21……
//
//        Example 1:
//
//        Input :
//        N = 4
//        Output:
//        10
//        Explanation:
//        The 4th term of the Series is 10.
//        Example 2:
//
//        Input :
//        N = 3
//        Output:
//        6
//        Explanation:
//        The 3rd term of the Series is 6.

public class FindNthTerm {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findNthTerm(n));
    }
    static int findNthTerm(int N) {
        // code here
        int counter = 1;
        int[] series = new int[N];

        for(int i = 0; i < N; i++){
            if(i == 0){
                series[i] = 1;
            }
            else {
                series[i] = series[i-1] + counter;
            }
            counter++;
        }
        return series[N-1];
    }
}
