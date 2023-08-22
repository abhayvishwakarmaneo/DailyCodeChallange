package gfg.problems.basic;

public class ClosestNumber {
    public static void main(String[] args) {
        int N = 13;
        int M = 4;

        System.out.println(closestNumber(N, M));
    }

    static int closestNumber(int N, int M) {
        // code here
//        int quotient = N / M;
//
//        int possibleClosestNumber1 = M * quotient;
//
//        int possibleClosestNumber2 = (N * M) > 0 ? (M * (quotient + 1)) : (M * (quotient - 1));
//
//        if (Math.abs (N - possibleClosestNumber1) < Math.abs (N - possibleClosestNumber2)) {
//            return possibleClosestNumber1;
//        }
//        return possibleClosestNumber2;
//======================Above Solution is Optimized=========================================================
        int resLeft = 0;
        int resRight = 0;
        if (N % M == 0) {
            return N;
        } else {
            for (int i = 1; i <= Math.abs(N); i++) {
                int left = N - i;
                int right = N + i;
                if (left >= Math.abs(M) && right >= Math.abs(M)) {
                    if (right % M == 0) {
                        resRight = right;
                        return resRight;
                    } else if (left % M == 0) {
                        resLeft = left;
                        return resLeft;
                    }
                }else if(right >= M && right % M == 0){
                    resRight = right;
                    return resRight;
                }else if(left >= M && left % M == 0){
                    resLeft = left;
                    return resLeft;
                }
                else {
                    if(left % M == 0){
                        resLeft = left;
                        return resLeft;
                    }
                    else if(right % M == 0){
                        resRight = right;
                        return resRight;
                    }else if (left % M == 0 && right % M == 0) {
                        resLeft = left;
                        resRight = right;
                        break;
                    }
                }
            }

            if (resLeft < 0 && resRight < 0) {
                return resLeft;
            } else {
                if (resRight > 0)
                    return resRight;
                else
                    return resLeft;
            }
        }
    }
}