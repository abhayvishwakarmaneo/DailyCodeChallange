package gfg.problems.school;

//A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is
// constant,i.e., all elements in a diagonal are same.
//        Given a matrix A of order N X M your task is to complete the function isToeplitz which
//        returns true if the matrix is Toeplitz otherwise returns false.
//
//        Example 1:
//
//        Input: 3 3 6 7 8 4 6 7 1 4 6
//        Output: 1
//        Explanation:
//        The test case represents a 3x3 matrix which looks like
//        6 7 8
//        4 6 7
//        1 4 6
//        Output: 1(True) as values in all diagonals are same.
//        Example 2:
//
//        Input:
//        2 3
//        1 2 3 4 5 6
//        Output: 0
//        Explanation:
//        Matrix of order 2x3 will be
//        1 2 3
//        4 5 6
//        Output: 0(False) as values in all diagonals
//        are not same.

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] mat = {{11, 74, 0, 93}, {40, 11, 74, 7}};
        int N = mat.length;
        int M = mat[0].length;

        System.out.println(isToepliz(mat, N, M));
    }

    static boolean isToepliz(int[][] mat, int N, int M) {
        // Your code here
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (j != 0 && i != 0) {
                    if (mat[i][j] != mat[i - 1][j - 1]) {
                        flag = false;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
}
