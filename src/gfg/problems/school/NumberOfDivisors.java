package gfg.problems.school;

public class NumberOfDivisors {
    static long count_divisors(int N) {
        // code here
        long counter = 0;

//        if(N%3 == 0){
//            counter = 1;
//        }
//        for (int i = 3; i <= N/2; i += 3) {
//            if (N % i == 0)
//                counter++;
//        }
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                if (i % 3 == 0) {
                    counter++;
                }
                if (i != N / i && (N / i) % 3 == 0) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int n = 30;

        System.out.println(count_divisors(n));
    }
}
