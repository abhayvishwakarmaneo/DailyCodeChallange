package gfg.problems.easy;

public class LuckyNumbers {
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
