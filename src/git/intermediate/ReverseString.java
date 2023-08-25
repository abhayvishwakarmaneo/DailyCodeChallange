package git.intermediate;

public class ReverseString {
    public static void main(String[] args) {
        String str = "strips";
        String output = "";
        for(int i = str.length() -1; i >= 0; i-- ){
            output+= str.charAt(i);
        }
        System.out.println(output);
    }
}
