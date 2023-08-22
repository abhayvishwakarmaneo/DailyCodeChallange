package gfg.problems.school;

public class IdenticalMatrices {
    public static void main(String[] args) {
        int[][] Grid1={{1,2},{3,4}};
        int[][] Grid2={{1,2},{3,4}};
        int N = Grid1.length;

        System.out.println(areMatricesIdentical(N, Grid1, Grid2));
    }

    static int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        // code here
        int res = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(Grid1[i][j] != Grid2[i][j]){
                    res = 0;
                    return res;
                }
            }
        }

        return res;
    }
}