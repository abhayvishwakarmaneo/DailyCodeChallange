package gfg.problems.school;

public class SumOfMatrix {
    static int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sum += Grid[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,0,1}, {-8,9,-2}};
        int n = 2;
        int m = 3;

        System.out.println(sumOfMatrix(n , m, matrix));
    }
}