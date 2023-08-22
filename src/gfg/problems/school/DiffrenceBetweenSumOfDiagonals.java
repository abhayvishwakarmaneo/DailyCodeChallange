package gfg.problems.school;

//Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals.
//
//        Example 1:
//
//        Input:
//        N=3
//        Grid=[[1,2,3],[4,5,6],[7,8,9]]
//        Output:
//        0
//        Explanation:
//        Sum of primary diagonal = 1+5+9 = 15.
//        Sum of secondary diagonal = 3+5+7 = 15.
//        Difference = |15 - 15| = 0.
//        Example 2:
//
//        Input:
//        N=3
//        Grid=[[1,1,1],[1,1,1],[1,1,1]]
//        Output:
//        0
//        Explanation:
//        Sum of primary diagonal = 1+1+1=3.
//        Sum of secondary diagonal = 1+1+1=3.
//        Difference = |3-3| = 0.

public class DiffrenceBetweenSumOfDiagonals {
    public static void main(String[] args) {
        int[][] Grid= {{1,2,3},{4,5,6},{7,8,9}};
        int n = Grid.length;

        System.out.println(diagonalSumDifference(n, Grid));
    }
    static int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int rightCounter = Grid[0].length-1;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j){
                    leftSum += Grid[i][j];
                }
                if(j == rightCounter){
                    rightSum += Grid[i][j];
                    rightCounter--;
                }
            }
        }

        return Math.abs(leftSum-rightSum);
    }
}