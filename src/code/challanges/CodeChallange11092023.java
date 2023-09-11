package code.challanges;

//Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
//        Take the set of integers
//        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
//        First, delete every second number, we get following reduced set.
//        1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
//        Now, delete every third number, we get
//        1, 3, 7, 9, 13, 15, 19,….….
//        Continue this process indefinitely……
//        Any number that does NOT get deleted due to above process is called “lucky”.
//
//        You are given a number N, you need to tell whether the number is lucky or not. If the number is lucky return 1 otherwise 0.
//
//        Example 1:
//
//        Input:
//        N = 5
//        Output: 0
//        Explanation: 5 is not a lucky number
//        as it gets deleted in the second
//        iteration.
//        Example 2:
//
//        Input:
//        N = 19
//        Output: 1
//        Explanation: 19 is a lucky number because
//        it does not get deleted throughout the process.

public class CodeChallange11092023 {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isLucky(n));
    }

    public static boolean isLucky(int n) {
        int i = 2;
        while (n % i != 0) {
            if (n % i == 0)
                return false;
            if (n < i)
                return true;
            n = n - n / i++;
        }
        return false;
    }
}