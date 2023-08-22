package gfg.problems.school;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        long n = 3;

        System.out.println(sum_of_square_oddNumbers(n));
    }

    public static long sum_of_square_oddNumbers(long n) {
        // Code here
        long sum = 0;
        long start_num = 1;

        for (int i = 0; i < n; i++) {
            sum += (start_num*start_num);
            start_num+=2;
        }

        return sum;
    }
}