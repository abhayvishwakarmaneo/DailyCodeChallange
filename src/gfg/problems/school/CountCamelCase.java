package gfg.problems.school;

public class CountCamelCase {
    static int countCamelCase (String s)
    {
        // your code here
        int counter = 0;

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == Character.toUpperCase(s.charAt(i))){
                counter++;
            }
        }

        return counter;
    }
    public static void main(String[] args) {
        String s = "jhbbzJHVCH";

        System.out.println(countCamelCase(s));
    }
}