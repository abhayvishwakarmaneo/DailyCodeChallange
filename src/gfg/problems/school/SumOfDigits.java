package gfg.problems.school;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;

        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N != 0){
            sum += N%10;
            N /= 10;
        }
        return sum;
    }
}