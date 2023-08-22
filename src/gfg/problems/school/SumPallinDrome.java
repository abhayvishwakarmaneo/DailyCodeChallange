package gfg.problems.school;

public class SumPallinDrome {
    static long isSumPalindrome(long n){
        // code here
        long num = n;
        long pallin = 0;
        long sum = 0;

        while(n != 0){
            sum = (sum*10)+ (n%10);
            n /= 10;
        }

        long res = num+sum;
        long comp = res;

        while(comp != 0){
            pallin = (pallin*10)+ (comp%10);
            comp /= 10;
        }


        return pallin;
    }

    public static void main(String[] args) {
        int n = 73;

        System.out.println(isSumPalindrome(n));
    }
}