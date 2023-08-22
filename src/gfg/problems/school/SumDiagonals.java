package gfg.problems.school;

public class SumDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        System.out.println(DiagonalSum(matrix));
    }
    public static int DiagonalSum(int[][] matrix)
    {
        // code here
        int rightCounter = matrix[0].length-1;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i == j){
                    leftSum += matrix[i][j];
                }
                if(j == rightCounter){
                    rightSum += matrix[i][j];
                    rightCounter--;
                }
            }
        }
        return leftSum+rightSum;
    }
}