package gfg.problems.school;

public class RemoveCharactersFromAlphanumeric {
    static String removeCharacters(String S) {
        // code here
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< S.length(); i++){
            if(Character.isDigit(S.charAt(i))){
                builder.append(S.charAt(i));
            }
        }

        return new String(builder);
    }

    public static void main(String[] args) {
        String str = "AA1d23cBB4";

        System.out.println(removeCharacters(str));
    }
}
