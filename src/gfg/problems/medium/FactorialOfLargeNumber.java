package gfg.problems.medium;

import java.util.ArrayList;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        int input = 897;

        System.out.println(factorial(input));
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int carry = 0;
        for(int i = 2 ; i <= N ; i++){
            for(int listIdx = list.size() - 1; listIdx >= 0 ; listIdx--){
                int product = (list.get(listIdx) * i) + carry;
                list.set(listIdx,product % 10);
                carry = product / 10;
            }

            while(carry != 0){
                list.add(0 , carry % 10);
                carry /= 10;
            }
        }

        return list;
    }
}
