package gfg.problems.school;

public class TimeSubstraction {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 168;

        System.out.println(subClock(num1, num2));
    }
    static int subClock(int num1, int num2) {
        // code here
        int time = num1-num2;
        int format = 0;

        System.out.println(time);
        if(time < 0){
            if(time < -12)
                time = time%12;
            if(time == 0){
                format = time;
            }else
                format = 12+time;
        }
        else if(time > 0 && time > 12){
            format = time %12;
        }
        else if( time == 12){
            format = 0;
        }

        return format;
    }
}
