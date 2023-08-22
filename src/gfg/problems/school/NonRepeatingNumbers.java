package gfg.problems.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] nums = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
        int n = 2;

        System.out.println(Arrays.toString(singleNumber(nums)));
    }

    public static int[] singleNumber(int[] nums) {
        // Code here
        int[] res = new int[2];
        List<Integer> distinct = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1)
                distinct.add(nums[i]);
        }
        for (int i = 0; i < distinct.size(); i++) {
           res[i] = distinct.get(i);
        }

        Arrays.sort(res);
        return res;
    }
}