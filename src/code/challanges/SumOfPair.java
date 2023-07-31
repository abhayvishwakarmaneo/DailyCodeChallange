import java.util.Scanner;

class SumOfPair
{
    public static void findSumOfPair(int[] nums, int target)
    {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.printf("Pair found ("+nums[i]+","+nums[j]+")");
                    return;
                }
            }
        }
            System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements to add :");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target Number");
        int target = sc.nextInt();

        findSumOfPair(nums, target);
    }
}