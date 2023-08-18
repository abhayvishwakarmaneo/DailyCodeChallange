package gfg.problems;

public class PrintWithoutLoop {
    static void printTillN(int N){
        // code here
        if(N < 1)
            return;
        else {
            printTillN(N-1);
            System.out.print(N+" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printTillN(n);
    }
}
