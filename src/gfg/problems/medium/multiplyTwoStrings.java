package gfg.problems.medium;

import java.math.BigInteger;

public class multiplyTwoStrings {
    public static void main(String[] args) {
        String s1 = "342857466747623190253535915582654079729535249666495366204751947309612861759399743340838318159436477709808";
        String s2 = "4471335218251938463464417392810911901096513109096223883606949011331588570391782354624160500218170491853613331964401401436877119247304542334868677958787620083249";

        System.out.println(multiplyStrings(s1, s2));
    }

    public static String multiplyStrings(String s1, String s2) {
        //code here
        BigInteger b1= new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger res = b1.multiply(b2);
        return res.toString();
    }
}
