package gfg.problems.school;

//Construct a 6 input gate which performs the following logical operation:
//        (not(A)).B + C.D +E.(not(F))
//        where A, B, C, D, E and F are the inputs to the 6 input gate.
//
//        Example 1:
//
//        Input: A = 1, B = 1, C = 0
//        D = 0, E = 1, F = 1
//        Output: 0
//        Explanation: (not(A)).B + C.D +E.(not(F))
//        = (not(1)).1 + 0.0 +1.(not(1)) = 0.
//        Example 2:
//
//        Input: A = 1, B = 1, C = 1
//        D = 1, E = 1, F = 1
//        Output: 1
//        Explanation: (not(A)).B + C.D +E.(not(F))
//        = (not(1)).1 + 1.1 +1.(not(1)) = 1.

public class CombinationalLogic {
    public static void main(String[] args) {
        int A = 0, B = 1, C = 0;
        int D = 0, E = 1, F = 0;

        System.out.println(logicalOperation(A, B, C, D, E, F));
    }
    static int logicalOperation(int A,int B,int C,int D,int E,int F){
        // code here
        int res = or(or((and(not(A),B)),and(C,D)),(and(E,(not(F)))));
        return res;
    }

    static int not(int n){
        if(n == 1)
            n = 0;
        else
            n = 1;

        return n;
    }

    static int and(int a, int b){
        int res = 0;
        if(a == 1 && b == 1){
            res = 1;
        }
        else
            res = 0;
        return res;
    }

    static int or(int a, int b){
        int res = 0;
        if(a == 0 && b == 0){
            res = 0;
        }
        else
            res = 1;
        return res;
    }
}