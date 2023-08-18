package gfg.problems;

public class EvenOdd {
    static String oddEven(int N){
        // code here
        String str = "";
        if(N == 0)
            str = "even";
        else if(N == 1)
            str = "odd";
        else{
            if(N%2==0)
                str = "even";
            else
                str = "odd";
        }

        return str;
    }
    public static void main(String[] args) {
        int n = 23;

        System.out.println(oddEven(n));
    }
}