package gfg.problems.school;

public class GCD {
    public static void main(String[] args) {
        int a = 43, b = 38;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int A , int B)
    {
//        int LCM = 1;
//        int GCD = 0;
//        if(A == B){
//            GCD = A;
//            return GCD;
//        } else if (A < B) {
//            if(B % A == 0){
//                GCD = A;
//            }
//            else {
//                for(int i = 2; i <= A; i++){
//                    int chk = B*i;
//                    if(chk % A == 0){
//                        LCM  = chk;
//                        break;
//                    }
//                }
//                GCD = (A*B)/LCM;
//            }
//        } else if (A > B) {
//            if(A % B == 0){
//                GCD = B;
//            }
//            else {
//
//                for(int i = 2; i <= B; i++){
//                    int chk = A*i;
//                    if(chk % B == 0){
//                        LCM = chk;
//                        break;
//                    }
//                }
//                GCD = (A*B)/LCM;
//            }
//        }
//
//        return GCD;

//========================================================
        int output = 1;
        if(A>B){
            if(A%B == 0)
                output = B;
            else{
                for(int i = B-1; i >= 2; i--){
                    if(A%i == 0 && B%i == 0){
                        output = i;
                        break;
                    }
                }
            }
        }
        else if(A<B){
            if(B%A == 0){
                output = A;
            }
            else{
                for(int i = A-1; i >= 2; i--){
                    if(A%i == 0 && B%i == 0){
                        output = i;
                        break;
                    }
                }
            }
        }
        else if(A == B)
            output = A;
        return output;
    }
}
