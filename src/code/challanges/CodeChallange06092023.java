package code.challanges;

public class CodeChallange06092023 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int res = nums.length;

        int sum = res*(res+1)/2;                //This will calculate the addition of 0 to N number.  N is length of array
        for(int num : nums)
            sum -= num;                         // now here in this loop we will subtract all the elements from the sum
        return sum;                             // The remaining number is the missing number
//=========================Above Solution is the fastest solution=========================================
//        Arrays.sort(nums);
//        for(int i = 0 ; i < nums.length;i++){
//            if(i != nums[i]){
//                res = i;
//                break;
//            }
//        }
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
//        return res;
    }
}
