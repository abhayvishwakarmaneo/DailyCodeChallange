package gfg.problems.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PartyOfCouples {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;

        System.out.println(findSingle(n, arr));
    }
    static int findSingle(int N, int arr[]){
        // code here
        List<Integer> singles = new ArrayList<>();

        for(int i = 0; i < N; i++){
            if(i == 0)
                singles.add(arr[i]);
            else
            if(singles.contains(arr[i])) {
                int index = singles.indexOf(arr[i]);
                singles.remove(index);
            }
            else
                singles.add(arr[i]);
        }

        Optional<Integer> single = singles.stream().distinct().findFirst();
        return single.orElse(0);
    }
}
