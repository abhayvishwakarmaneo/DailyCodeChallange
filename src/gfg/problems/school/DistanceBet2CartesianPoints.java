package gfg.problems.school;

public class DistanceBet2CartesianPoints {
    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = -2;

        System.out.println(distance(x1, y1, x2, y2));
    }
    public static int distance(int x1, int y1, int x2, int y2)
    {

        return (int) Math.round(Math.sqrt(((int)Math.pow(x2 - x1, 2)) + ((int) Math.pow(y2 - y1, 2))));
    }
}
