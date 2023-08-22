package gfg.problems.school;

public class SumOfGP {
    public static void main(String[] args) {
        long n = 3, a = 3, r = 2;

        System.out.println(sum_of_gp(n, a, r));
    }

    public static long sum_of_gp(long n, long a, long r)
    {
        // Code here
        long[] arr = new long[(int) n];
        for(int i = 0; i < n; i++){
            if(i == 0){
                arr[i] = a;
            }
            else
                arr[i] = arr[i-1]*r;
        }

        long sum = 0;

        for (long num:arr) {
            sum+=num;
        }
        return sum;
    }
}