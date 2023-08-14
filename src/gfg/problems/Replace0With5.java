package gfg.problems;

public class Replace0With5 {
    public static int convertFive(int n){
        //add code here.
        int num = n;
        int sum = 0;
        while(num != 0){
           int chk = num % 10;
           if(chk == 0){
               chk = 5;
           }
           num /= 10;
           sum = (sum*10)+chk;
        }
         num =0;
        while (sum != 0){
            num = (num*10)+(sum%10);
            sum /= 10;
        }

        return  num;
    }
    public static void main(String[] args) {
        int n = 1001004;
        System.out.println(convertFive(n));
    }
}