package gfg.problems.basic;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1,2,3};
        int n = a.length;
        int m = b.length;
        System.out.println(doUnion(a,n,b,m));
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> union = new HashSet<>();
        for (int num:a) {
            union.add(num);
        }
        for(int num2: b){
            union.add(num2);
        }
        return union.size();
    }
}
