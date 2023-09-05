package gfg.problems.easy;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "c";
        System.out.println(encode(str));
    }
    static String encode(String str)
    {
        //Your code here
        int counter = 1;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(i == 0)
                res.append(str.charAt(i));
            else if(str.charAt(i) == str.charAt(i-1)){
                counter++;
            }
            else{
                res.append(counter);
                counter = 1;
                res.append(str.charAt(i));
            }

            if(i == str.length() - 1)
                res.append(counter);
        }
        return res.toString();
    }
}
