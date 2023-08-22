package gfg.problems.school;

import java.util.Arrays;

public class SurfaceAreaAndVolumeOfCuboid {
    public static void main(String[] args) {
        int l = 29077, b = 62884, h = 99973;
        System.out.println(Arrays.toString(find(l, b, h)));
    }
    public static long[] find(int l, int b, int h)
    {
        // code here
        long[] areas = new long[2];
        areas[0] = (long) 2*(((long) l *b)+((long) b *h)+((long) l *h));
        areas[1] = (long) l *b*h;

        return areas;
    }
}