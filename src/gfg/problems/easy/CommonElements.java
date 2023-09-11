package gfg.problems.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
        int[] A = {3, 3, 3};
        int n1 = A.length;
        int[] B = {3, 3, 3};
        int n2 = B.length;
        int[] C = {3, 3, 3};
        int n3 = C.length;
        System.out.println(commonElements(A, B, C, n1, n2, n3));
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
////====================Solution 1======================================================
//        int i = n1-1;
//        int j = n2-1;
//        int k = n3-1;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        while(k >= 0){
//            if(i >= 0){
//                if(i == 0){
//                    map.put(A[i], 1);
//                }
//                else if(A[i] != A[i-1]){
//                    map.put(A[i], map.getOrDefault(A[i], 0)+1);
//                }
//                i--;
//            }
//            if(i == -1 && j != -1){
//                if(j == 0){
//                    map.put(B[j], map.getOrDefault(B[j], 0)+1);
//                }
//                else if(B[j] != B[j-1]){
//                    map.put(B[j], map.getOrDefault(B[j], 0)+1);
//                }
//                j--;
//            }
//            if(i == -1 && j == -1){
//                if(k == 0){
//                    map.put(C[k], map.getOrDefault(C[k], 0)+1);
//                }
//                else if(C[k] != C[k-1]){
//                    map.put(C[k], map.getOrDefault(C[k], 0)+1);
//                    if(map.get(C[k]) == 3){
//                        if(list.isEmpty())
//                            list.add(C[k]);
//                        else if(C[k] < list.get(0)){
//                            list.add(0, C[k]);
//                        }
//                        else{
//                            list.add(C[k]);
//                        }
//                    }
//                }
//                k--;
//            }
//        }
//        return list;

////==================================Solution 2=========================================================
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n1; i++){
            map.put(A[i], 1);
        }
        for(int j = 0; j < n2; j++){
            if(j == 0 || B[j] != B[j-1]){
                map.put(B[j], map.getOrDefault(B[j] , 0)+1);
            }
        }
        for(int k = 0; k < n3; k++){
            if(k == 0 || C[k] != C[k-1]) {
                map.put(C[k], map.getOrDefault(C[k], 0) + 1);
            }
        }

        map.forEach((key, value) -> {
            if(value == 3){
                list.add(key);
            }
        });
        list.sort(Comparator.naturalOrder());
        return list;

////===================================Solution 3===========================================================

//        ArrayList<Integer> answer = new ArrayList<Integer>();
//        int i = 0, j = 0, k = 0;
//        int check = 0; //for handling duplicates
//        while(i < n1 && j < n2 && k < n3) {
//            if(A[i] == B[j] && B[j] == C[k]) {
//                if(A[i] != check) {
//                    answer.add(A[i]);
//                }
//                check = A[i];
//            }
//            if(A[i] < B[j]) {
//                i++;
//            } else if(B[j] < C[k]) {
//                j++;
//            } else{
//                k++;
//            }
//        }
//        return answer;
    }
}
