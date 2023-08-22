package gfg.problems.school;

public class AutoMorphicNumber {
    public static void main(String[] args) {
        int n = 540;

        System.out.println(is_AutomorphicNumber(n));
    }
    public static String is_AutomorphicNumber(int n)
    {
        // Code here
        String str = "Automorphic";
        int pow = n*n;

        while(n != 0){
            int num1 = n%10;
            int num2 = pow%10;
            if(num1 != num2){
                str = "Not Automorphic";
                break;
            }
            n /= 10;
            pow /= 10;
        }
        return str;
    }
}