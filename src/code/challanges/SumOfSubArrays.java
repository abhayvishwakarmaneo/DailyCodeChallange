import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class SumOfSubArrays {
    public static void findSumOfSubArrays(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int counter = 0;
            int[] subarray = new int[n];
            subarray[counter] = nums[i];
            sum += nums[i];
            for (int j = i+1; j < n; j++) {
                counter++;
                subarray[counter] = nums[j];
                sum += nums[j];
                if(sum == 0){
                    IntStream intStream = Arrays.stream(subarray).filter(s -> s != 0);
                    System.out.println(Arrays.toString(intStream.toArray()));
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements to add :");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        findSumOfSubArrays(nums, n);
    }
}