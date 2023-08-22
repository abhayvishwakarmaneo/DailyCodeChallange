package gfg.problems.school;

public class AlternateCharacters {
    static String delAlternate(String S) {
        // code here
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < S.length(); i++ ){
            if(i % 2 == 0){
                str.append(S.charAt(i));
            }
        }

        S = str.toString();
        return S;
    }

    public static void main(String[] args) {
        String str = "ThereIsSomething";

        System.out.println(delAlternate(str));
    }
}