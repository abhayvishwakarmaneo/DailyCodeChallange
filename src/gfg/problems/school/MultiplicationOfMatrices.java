package gfg.problems.school;

import java.util.Arrays;

public class MultiplicationOfMatrices {
    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        //add code here.
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                C[i][j] = 0;

                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(C[i]));
        }
    }

    public static void main(String[] args) {
        int N = 2;
        int[][] A = {{7, 8}, {2 , 9}};
        int[][] B = {{14, 5}, {5, 18}};
        int[][] C = new int[N][N];

        multiply(A, B, C, N);
    }
}
