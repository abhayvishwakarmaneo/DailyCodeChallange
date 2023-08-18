package gfg.problems;

import java.util.ArrayList;

public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> tables = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            tables.add(i*N);
        }
        return tables;
    }

    public static void main(String[] args) {
        int n = 9;

        System.out.println(getTable(n));
    }
}
