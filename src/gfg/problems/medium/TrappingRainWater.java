package gfg.problems.medium;

public class TrappingRainWater {
    public static void main(String[] args) {

    }
    static long trappingWater(int[] arr, int n) {
        // Your code here
        int left = 0;
        int leftMax = arr[left];
        int right = n-1;
        int rightMax = arr[right];
        long water = 0;
        while(left < right){
            if(leftMax < rightMax){
                left++;
                if(leftMax < arr[left] ){
                    leftMax = arr[left];
                }
                else{
                    water += leftMax - arr[left];
                }
            }else{
                right--;
                if(rightMax < arr[right]){
                    rightMax = arr[right];
                }
                else{
                    water += rightMax - arr[right];
                }
            }
        }
        return water;
    }
}
