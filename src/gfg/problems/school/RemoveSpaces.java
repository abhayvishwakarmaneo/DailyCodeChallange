package gfg.problems;

public class RemoveSpaces {
    static String modify(String S)
    {
        return S.replaceAll("\\s", "");
    }
    public static void main(String[] args) {
        String str = "He  lll o";

        System.out.println(modify(str));
    }
}