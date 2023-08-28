package git.intermediate;

import java.util.Arrays;

public class EvenOddArrayElement {
    public static void main(String[] args) {
        int[] nums  = {220,34,5,23,4567,233,12324,345322};

        System.out.println(Arrays.toString(check(nums)));
    }

    public static int[] check(int[] nums){
        int[] counters = new int[nums.length];
        int even = 0;
        int odd = 0;
        for(int i = 0;i < nums.length; i++){
            int counter = 0;
            int num = nums[i];
            if(num < 0){
                num *= -1;
            }
            while (num != 0){
                counter++;
                num /= 10;
            }

            if(counter % 2 == 0)
                even++;
            else
                odd++;
            counters[i] = counter;
        }

        System.out.println("Even Numbers ->"+even);
        System.out.println("Odd Numbers ->"+odd);

        return counters;
    }
}
