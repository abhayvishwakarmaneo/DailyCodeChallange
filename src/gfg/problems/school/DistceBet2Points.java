package gfg.problems.school;

public class DistceBet2Points {
    public static void main(String[] args) {
        int x1= -20, y1 = 23, x2 = -15, y2 = 68;

        System.out.println(distance(x1,y1,x2,y2));
    }
    public static int distance(int x1, int y1, int x2, int y2)
    {
        // Code here
        double dist = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
        return (int) Math.round(dist);
    }
}
