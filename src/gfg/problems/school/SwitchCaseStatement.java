package gfg.problems.school;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int n = 5;
        String str ="";
        switch (n){
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
            default:
                str = "not in range";
        }

        System.out.println(str);
    }
}