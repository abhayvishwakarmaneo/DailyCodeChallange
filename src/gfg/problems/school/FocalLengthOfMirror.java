package gfg.problems.school;

public class FocalLengthOfMirror {
    public static void main(String[] args) {
        String type = "convex";
        float R = 10f;

        System.out.println(findFocalLength(R, type));
    }
    public static int findFocalLength(float R, String type)
    {
        // code here
        int res = 0;
        if(type.equals("concave")){
            res = (int) Math.floor(R/2);
        }
        else
            res = (int) Math.floor(-R/2);

        return res;
    }
}