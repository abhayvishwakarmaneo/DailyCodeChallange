import java.util.Scanner;

class ProductOfOtherElements {
    public static void findProduct(int[] nums, int n) {
        
        int[] newnums = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    if ((j == n - 1) && (j == i)) {
                        break;
                    }
                    j++;
                }
                product = product * nums[j];
            }
            newnums[i] = product;
        }

        for (int k = 0; k < n; k++) {
            System.out.println("");
            System.out.println(newnums[k]);
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

        findProduct(nums, n);
    }
}