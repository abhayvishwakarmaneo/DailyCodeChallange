package code.challanges;

import java.util.Arrays;

public class CodeChallange06092023 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int res = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
            if(i != nums[i]){
                res = i;
                break;
            }
        }
//=====================Both above and below solutions have same time complexity===========================
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num, 0)+1);
//        }
//        for(int i = 0; i < nums.length; i++){
//            if(!map.containsKey(i)){
//                res = i;
//            }
//        }
        return res;
    }
}
