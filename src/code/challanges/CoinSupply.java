// Given an unlimited supply of coins of given denominations, find the total number of distinct ways to get the desired change.
// For example:
// Input: S = { 1, 3, 5, 7 }, target = 8
 
// The total number of ways is 6
 
// { 1, 7 }
// { 3, 5 }
// { 1, 1, 3, 3 }
// { 1, 1, 1, 5 }
// { 1, 1, 1, 1, 1, 3 }
// { 1, 1, 1, 1, 1, 1, 1, 1 }
 
 
// Input: S = { 1, 2, 3 }, target = 4
 
// The total number of ways is 4
 
// { 1, 3 }
// { 2, 2 }
// { 1, 1, 2 }
// { 1, 1, 1, 1 }


public class CoinSupply {
    public static int count(int[] S, int n, int target)
    {
        if (target == 0)
            return 1;

        if (target < 0 || n < 0) 
            return 0;

        int incl = count(S, n, target - S[n]);
        int excl = count(S, n - 1, target);
 
        return incl + excl;
    }
 
    public static void main(String[] args)
    {
        int[] S = { 1, 3, 5, 7};
        int target = 8;
 
        System.out.print("The total number of ways to get the desired change is "
                                + count(S, S.length - 1, target));
    }
}
