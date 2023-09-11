package gfg.problems.easy;

import java.util.List;
import java.util.Stack;

public class MidElementOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(List.of(10, 20, 40 ,50));
        deleteMid(stack, stack.size());
    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here
        int mid;
        if(sizeOfStack % 2== 0){
            mid = ((sizeOfStack)/2)-1;
        }else {
            mid = sizeOfStack/2;
        }
        s.removeElementAt(mid);

        System.out.println("Binary of 10 is -> "+Integer.toBinaryString(10));
    }
}
