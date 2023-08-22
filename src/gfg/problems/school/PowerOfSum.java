package gfg.problems.school;

public class PowerOfSum {
    public static void main(String[] args) {
        long n = 2;
        System.out.println(sum_of_square_evenNumbers(n));
    }
    public static long sum_of_square_evenNumbers(long n)
    {
        // Code here
//        long counter = n;
//        int i = 2;
//        long sum = 0;
//        while (counter != 0){
//            sum += Math.pow(i, 2);
//            i +=2;
//            counter--;
//        }
//        return sum;




        long sum = 0;
        for(int i = 2; i <= n+n; i += 2){
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
