package gfg.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] A = {1,3,3,3,2};
        int n = A.length;

        System.out.println(majorityElement(A, n));
    }
    static int majorityElement(int a[], int size)
    {
        int res;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < size; i++){
            if(!map.containsKey(a[i]))
                map.put(a[i], 1);
            else {
                map.put(a[i], map.get(a[i])+1);
            }
        }

        System.out.println(map);

        res = map.entrySet().stream().filter(integerIntegerEntry -> integerIntegerEntry.getValue() > size/2)
                .map(Map.Entry::getKey).findFirst().orElse(-1);

        return res;
    }
}
