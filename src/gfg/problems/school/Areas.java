package gfg.problems.school;

import java.util.Arrays;

public class Areas {
    public static void main(String[] args) {
        int L = 32 , W = 32 , B = 54;
        int H = 12 , R = 52;

        System.out.println(Arrays.toString(getAreas(L, W, B, H, R)));

    }
    static int[] getAreas(int L , int W , int B , int H , int R) {
        // code here
        int[] area = new int[3];
        area[0] = L*W;
        area[1] = (int) (0.5*(B*H));
        area[2] = (int) (3.14*(R*R));
        //int areaOfRect = L*W;
        //int areaOfRightAngT = 0.5*B*H;

        return area;
    }
}