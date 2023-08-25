package git.intermediate;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int[] nums = {2,3,6,22,12};
        int sum= 0;
        for(int n: nums){
            sum += n;
        }
        System.out.println(sum);
    }
}
