package code.challanges;

//Given a non-negative integer n, print the first n rows of Pascal’s triangle.
//Each number in Pascal’s triangle is constructed by adding the two numbers diagonally above,
//where blank entries being interpreted as 0. For instance,
//the first eight rows of Pascal’s triangle are depicted in the diagram below.
//
//        For Example:
//        Input: n = 3
//        Output: [[1], [1, 1], [1, 2, 1]]
//
//        Input: n = 5
//        Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]


public class CodeChallange11082023 {
    public static void main(String[] args) {
        int n = 3;
        int[][] pattern = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

            }
        }


//        int space = (n+(n-1))/2;

//        for(int i = 1; i <= n; i++){
//            if(i == 1) {
//                for (int spaceCounterLeft1 = 0; spaceCounterLeft1 < space; spaceCounterLeft1++) {
//                    System.out.print(" ");
//                }
//                System.out.print(i);
//                for (int spaceCounteRight1 = 0; spaceCounteRight1 < space; spaceCounteRight1++) {
//                    System.out.print(" ");
//                }
//                space -= 2;
//            }
//            System.out.println();
//            if(i == 2) {
//                for (int spaceCounterLeft2 = 0; spaceCounterLeft2 < space; spaceCounterLeft2++) {
//                    System.out.print(" ");
//                }
//                System.out.print(i);
//                for (int spaceCounteRight2 = 0; spaceCounteRight2 < space; spaceCounteRight2++) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
    }
}