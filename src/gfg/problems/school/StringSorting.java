package gfg.problems.school;

public class StringSorting {
    public static void main(String[] args) {
        String str = "welcome";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(sb.charAt(i) > sb.charAt(j)){
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }

        System.out.println(sb);
//======================================================================================================
//        String output = "";
//        char[] charArray = str.toCharArray();
//        for(int i = 0; i < str.length()-1; i++){
//            for(int j = i+1; j < str.length(); j++){
//                if(Character.toLowerCase(charArray[i]) > Character.toLowerCase(charArray[j])) {
//                    char temp = charArray[i];
//                    charArray[i] = charArray[j];
//                    charArray[j] =  temp;
//                }
//            }
//        }
//
//        for (char c : charArray) {
//            output += c;
//        }
    }
}