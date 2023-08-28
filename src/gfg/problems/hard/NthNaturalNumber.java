package gfg.problems.hard;

public class NthNaturalNumber {
    public static void main(String[] args) {
        long n = 9;

        System.out.println(findNth(n));
    }
    static long findNth(long N)
    {
        long rem = N%9;


        return N+rem;
    }
}
