package gfg.problems.school;

public class FlipBits {
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1, 0};
        int N = A.length;

        System.out.println(maxOnes(A, N));
    }

    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int counterZero = 0;
        int counterOne = 0;
        int fromIndex = 1;
        int toIndex = 0;

//        if(a[0] == 1 && a[n-1] == 1)
//            counterOne += 2;
//        else if(a[0] == 1 && a[n-1] == 0){
//            counterZero += 1;
//            counterOne += 1;
//        }
//        else if(a[0] == 0 && a[n-1] == 1){
//            counterZero += 1;
//            counterOne += 1;
//        }
//        else
//            counterZero += 2;
//
        for(int i = 1; i < n-1; i++){
            if(a[i] == 0){
                counterOne++;
                toIndex = i;
            }
            if(a[i] == 1){

            }
        }
        return  counterZero;
    }

    static int replaceNum(int num){
        int n = num;
        if(n == 0)
            n = 1;
        else
            n = 0;

        return n;
    }
}