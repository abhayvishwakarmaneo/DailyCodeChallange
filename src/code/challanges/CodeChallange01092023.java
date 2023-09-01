package code.challanges;

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//        A defanged IP address replaces every period "." with "[.]".
//
//        Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"


public class CodeChallange01092023 {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == '.'){
                sb.replace(i,i+1, "[.]");
                i = i+2;
            }
        }
        return sb.toString();
    }
}
