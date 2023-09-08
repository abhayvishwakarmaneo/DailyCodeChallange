package code.challanges;

public class CodeChallange08092023 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n){
        String binary = Integer.toBinaryString(n);
        int counter = 0;
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '1'){
                counter++;
            }
        }
        return counter;
    }
}
