package gfg.problems.school;

//Given a number N. Check if it is perfect or not.
// A number is perfect if sum of factorial of its digit is equal to the given number.
//
//        Example 1:
//
//        Input: N = 23
//        Output: 0
//        Explanation: The sum of factorials of
//        digits of 23 is 2! + 3! = 2 + 6 = 8
//        which is not equal to 23. Thus, answer
//        is 0.
//        Example 2:
//
//        Input: N = 145
//        Output: 1
//        Explanation: The sum of factorials of digits
//        of 145 is 1! + 4! + 5! = 1 + 24 + 120 = 145
//        which is equal to 145.Thus, answer is 1.


public class PerfectNumber {
    public static void main(String[] args) {
        int n = 23;

        System.out.println(isPerfect(n));
    }
    static int isPerfect(int N) {
        // code here
        int res = 0;
        int num = N;
        int sum = 0;
        while(num != 0){
            int chk = num%10;
            int fact = 1;
            if(chk > 1){
                for(int i = chk; i > 1; i--){
                    fact*=i;
                }
            }
            sum+=fact;

            num /= 10;
        }

        if(sum == N)
            res = 1;

        return res;
    }
}