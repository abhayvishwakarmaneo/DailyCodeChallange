package gfg.problems.school;

import java.util.ArrayList;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numberPattern(3));
    }
    static ArrayList<String> numberPattern(int N){
        // code here
        ArrayList<String> pattern = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++){
                sb.append(j);
            }
            for(int k = i-1; k >=1; k--){
                sb.append(k);
            }
            pattern.add(new String(sb));
        }
        return pattern;
    }
}