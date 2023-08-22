package gfg.problems.school;

public class SumOfAp {
    public static void main(String[] args) {
        int n = 5;
        int a = 1;
        int d = 3;

        System.out.println(sum_of_ap(n, a, d));
    }
    public static int sum_of_ap(int n, int a, int d)
    {
        // Code here
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(i == 0){
                arr[i] = a;
                sum += arr[i];
            }
            else {
                arr[i] = arr[i-1] + d;
                sum+= arr[i];
            }
        }

        return sum;
    }
}