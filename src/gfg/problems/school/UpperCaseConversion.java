package gfg.problems;

public class UpperCaseConversion {
    public static String transform(String s){
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                newString.append(Character.toUpperCase(s.charAt(i)));
            } else if (i == s.length()-1) {
                char prevc = s.charAt(i - 1);
                if(prevc == ' '){
                    newString.append(Character.toUpperCase(s.charAt(i)));
                }
                else
                    newString.append(s.charAt(i));
            } else {
                char prevc = s.charAt(i - 1);
                char nextc = s.charAt(i + 1);
                char current = s.charAt(i);
                if (s.charAt(i) == ' ') {
                    newString.append(s.charAt(i));
                } else {
                    if (prevc == ' ' && nextc != ' ') {
                        current = Character.toUpperCase(current);
                        newString.append(current);
                    } else if (prevc == ' ' && nextc == ' ') {
                        newString.append(Character.toUpperCase(current));
                    } else {
                        newString.append(current);
                    }
                }
            }
        }
        s = newString.toString();
        return s;
    }

    public static void main(String[] args) {
        String s = "m sacrrfxm nj j ea m e o t kkj c";

        System.out.println(transform(s));
    }
}