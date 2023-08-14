package gfg.problems;

public class ArmStrongNumber {
    static String armstrongNumber(int n){
        // code here
        int num = n;
        int sum = 0;
        String res = "No";
        while(num != 0){
            int rem = num % 10;
            sum += rem*rem*rem;
            num /= 10;
        }

        if(sum == n)
            res = "Yes";

        return res;
    }

    public static void main(String[] args) {
        int n = 153;

        System.out.println(armstrongNumber(n));
    }
}
