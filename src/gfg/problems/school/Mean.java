package gfg.problems.school;

public class Mean {
    static int mean(int N , int[] A) {
        // code here
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }

        int mean = (int) Math.floor(sum/N);

        return mean;
    }

    public static void main(String[] args) {
        int[] A = {56 , 67 , 30 , 79};
        int N = A.length;
        System.out.println(mean(N, A));
    }
}
