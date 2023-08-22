package gfg.problems.school;

public class DiceProblem {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(oppositeFaceOfDice(n));
    }
    static int oppositeFaceOfDice(int N){
        // code here
        int oppFace = 0;

        switch (N){
            case 1:
                oppFace = 6;
                break;
            case 2:
                oppFace = 5;
                break;
            case 3:
                oppFace = 4;
                break;
            case 4:
                oppFace = 3;
                break;
            case 5:
                oppFace = 2;
                break;
            case 6:
                oppFace = 1;
                break;
        }
        return oppFace;
    }
}