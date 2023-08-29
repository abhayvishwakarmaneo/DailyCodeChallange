package code.challanges;

public class CodeChallange29082023 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < split.length; i++){
            String str = split[i];
            String rev = "";
            for(int j = str.length()-1; j >= 0 ; j--){
                rev += str.charAt(j);
            }

            if(i == split.length-1){
                sb.append(rev);
            }
            else{
                sb.append(rev).append(" ");
            }
        }

        return sb.toString();
    }

}
