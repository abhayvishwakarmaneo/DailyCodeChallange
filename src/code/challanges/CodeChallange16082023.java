package code.challanges;

//Suppose we are given n red and n blue water jugs, all of different shapes and sizes.
// All red jugs hold different amounts of water, as do the blue ones. Moreover,
// there is a blue jug for every red jug that holds the same amount of water and vice versa.
// The task is to efficiently group the jugs into pairs of red and blue jugs that hold the same amount of water.
//        Example:
//        Input:
//        red = {6, 3, 2, 8, 7};
//        blue = {8, 6, 7, 2, 3};
//
//        Output:
//
//        Red jugs: [2, 3, 6, 7, 8]
//        Blue jugs: [2, 3, 6, 7, 8]

import java.util.Arrays;

public class CodeChallange16082023 {
    public static void main(String[] args) {
        int[] red = {6, 3, 2, 8, 7};
        int[] blue = {8, 6, 7, 2, 3};

        if (red.length != blue.length)
            System.out.println("Not Possible");

        for (int i = 0; i < red.length; i++) {
            int redChk = red[i];
            int blueChk = blue[i];
            if (redChk != blueChk) {
                for (int j = i; j < blue.length; j++) {
                    if(redChk == blue[j]){
                        blue[i] = blue[j];
                        blue[j] = blueChk;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));

//================One way of solving  the Jug Problem=========================

//        Arrays.sort(red);
//        Arrays.sort(blue);
//
//        System.out.println(Arrays.toString(red));
//        System.out.println(Arrays.toString(blue));

//================One way of solving  the Jug Problem=========================
    }
}
