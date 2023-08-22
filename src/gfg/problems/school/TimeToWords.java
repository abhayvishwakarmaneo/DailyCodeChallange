package gfg.problems.school;

public class TimeToWords {
    public static void main(String[] args) {
        int H = 6;
        int M = 29;

        System.out.println(timeToWord(H, M));
    }
    public static String timeToWord(int H, int M)
    {
        // code here
        String[] numberToWord = {"zero","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
                "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","thirty"};

        String timeInWords = "";

        if(M==0){
            timeInWords = numberToWord[H]+" o' clock";
        }
        else if(M==1){
            timeInWords = "one minute past " + numberToWord[H];
        }
        else if((M>1 && M<15) || (M>15 && M<30)){
            timeInWords = numberToWord[M] +" minutes past " + numberToWord[H];
        }
        else if(M==15){
            timeInWords = "quarter past "+ numberToWord[H];
        }
        else if(M==30){
            timeInWords = "half past " + numberToWord[H];
        }
        else if((M>30 && M<45) || (M>45 && M<59)){
            int rem = 60-M;
            if(H == 12)
                H = 0;
            timeInWords = numberToWord[rem] + " minutes to " + numberToWord[H+1];
        }
        else if(M==45){
            timeInWords = "quarter to " + numberToWord[H+1];
        }
        else if(M==59){
            if(H == 12)
                H = 0;
            timeInWords = "one minute to " + numberToWord[H+1];

        }

        return timeInWords;
    }
}