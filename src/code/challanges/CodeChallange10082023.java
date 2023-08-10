package code.challanges;

//        Given a number N. Count the number of digits in N which evenly divides N.
//
//        Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
//
//        Example 1:
//
//        Input:
//        N = 12
//        Output:
//        2
//        Explanation:
//        1, 2 both divide 12 evenly
//        Example 2:
//
//        Input:
//        N = 23
//        Output
//        0
//        Explanation:
//        2 and 3, none of them
//        divide 23 evenly


public class CodeChallange10082023 {
    public static void main(String[] args) {
        int N = 2446;
        int max = 0;
        int num = N;
        while(num != 0){
            int check = num % 10;
            num /= 10;
            if(check > 0 && N % check == 0)
                max ++;
        }

        System.out.println(max);
    }
}