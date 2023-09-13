package code.challanges;

public class CodeChallange13092023 {
    public static void main(String[] args) {
        int n = 3;
        int s = 20;
        System.out.println(findLargest(n, s));
    }

    static String findLargest(int N, int S) {
        if (S == 0 && N > 1)
            return String.valueOf(-1);

        int num = 1;
        for (int i = 0; i < N; i++)
            num *= 10;
        num--;
        int numChk = num;
        int sum = Integer.MAX_VALUE;

        while(sum != S){
            num = numChk;
            sum = 0;
            while (num != 0) {
                int chk = num % 10;
                sum += chk;
                num /= 10;
            }
            if (sum < S)
                return String.valueOf(-1);

            numChk--;
        }
        numChk++;

        return String.valueOf(numChk);
    }
}
