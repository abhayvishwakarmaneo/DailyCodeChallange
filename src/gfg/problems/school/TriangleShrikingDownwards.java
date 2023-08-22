package gfg.problems.school;

public class TriangleShrikingDownwards {
    public static void main(String[] args) {
        String S = "Geeks";
        System.out.println(triDownwards(S));
    }

    static String triDownwards(String S) {
        // code here
        String str = "";
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (j < i)
                    str += ".";
                else
                    str += S.charAt(j);
            }
        }
        return str;
    }
}