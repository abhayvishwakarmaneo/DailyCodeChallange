package gfg.problems.school;

//Example 1:
//
//        Input:
//        N=56
//        Output:
//        1
//        Explanation:
//        The digit sum of 56 is 5+6=11.
//        Since, 11 is a palindrome number.Thus,
//        answer is 1.
//        Example 2:
//
//        Input:
//        N=98
//        Output:
//        0
//        Explanation:
//        The digit sum of 98 is 9+8=17.
//        Since 17 is not a palindrome,thus, answer
//        is 0.

public class NumberPallindrome {
    static int isDigitSumPalindrome(int N) {
        // code here
        int pallin = 0;
        int sum = 0;
        int res = 0;
        while(N != 0){
            sum += (N%10);
            N /= 10;
        }
        int num = sum;

        while(num != 0){
            pallin = (pallin*10)+(num%10);
            num /= 10;
        }
        if(sum == pallin)
            res = 1;
        else
            res = 0;

        return res;
    }

    public static void main(String[] args) {
        int n = 98;
        System.out.println(isDigitSumPalindrome(n));
    }
}