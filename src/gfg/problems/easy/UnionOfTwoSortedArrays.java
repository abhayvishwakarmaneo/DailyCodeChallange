package gfg.problems.easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 35};
        int[] arr2 = {6, 9, 13, 15, 20, 25, 29, 46};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(findUnion(arr1, arr2, n, m));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(arr1[i]);

        for (int j = 0; j < m; j++)
            set.add(arr2[j]);

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

//        Stream<Integer> sorted = set.stream().sorted();

        return list;
//===============================================================================================================
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0; i < n; i++){
//            if(!list.contains(arr1[i])){
//                list.add(arr1[i]);
//            }
//        }
//        for(int j = 0; j < m; j++){
//            if(!list.contains(arr2[j])){
//                list.add(arr2[j]);
//            }
//        }
//        list.sort(Comparator.naturalOrder());
//        return list;
    }
}
