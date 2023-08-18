package code.challanges;

public class CodeChallange18082023 {
    public static void main(String[] args) {
        int X1 = 2024;
        int Y1 = 1165;
        int R1 = 453;
        int X2 = 1631;
        int Y2 = 1165;
        int R2 = 7338;

        System.out.println(circleTouch(X1, Y1, R1, X2, Y2, R2));
    }
    static int circleTouch(int X1, int Y1, int R1, int X2, int Y2, int R2) {
        //Write your code here
        int touch = 0;
        int hor1 = 0;
        int hor2 = 0;
        int ver1 = 0;
        int ver2 = 0;

        if (X1 < X2 && Y1 < Y2) {
            int centreDist = (int) Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
            hor1 = X1 + R1;
            hor2 = X2 - R2;
            ver1 = Y1 + R1;
            ver2 = Y2 - R2;
            if ((hor1 > hor2 || hor1 == hor2) && (ver1 > ver2 || ver1 == ver2)) {
                if (R1 + R2 == centreDist + 1)
                    touch = 1;
                else if (R1 + R2 > centreDist) {
                    touch = 1;
                }
            }
        } else if (X1 > X2 && Y1 > Y2) {
            int centreDist = (int) Math.sqrt(Math.pow((X1 - X2), 2) + Math.pow((Y1 - Y2), 2));
            hor1 = X1 - R1;
            hor2 = X2 + R2;
            ver1 = Y1 - R1;
            ver2 = Y2 + R2;
            if ((hor1 < hor2 || hor1 == hor2) && (ver1 < ver2 || ver1 == ver2)) {
                if (R1 + R2 == centreDist + 1)
                    touch = 1;
                else if (R1 + R2 > centreDist) {
                    touch = 1;
                }
            }
        } else if (X1 < X2 && Y1 > Y2) {
            int centreDist = (int) Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y1 - Y2), 2));
            hor1 = X1 + R1;
            hor2 = X2 - R2;
            ver1 = Y1 - R1;
            ver2 = Y2 + R2;
            if ((hor1 > hor2 || hor1 == hor2) && (ver1 < ver2 || ver1 == ver2)) {
                if (R1 + R2 == centreDist)
                    touch = 1;
                else if (R1 + R2 > centreDist + 1) {
                    touch = 1;
                }
            }
        } else if (X1 > X2 && Y1 < Y2) {
            int centreDist = (int) Math.sqrt(Math.pow((X1 - X2), 2) + Math.pow((Y2 - Y1), 2));
            hor1 = X1 - R1;
            hor2 = X2 + R2;
            ver1 = Y1 + R1;
            ver2 = Y2 - R2;
            if ((hor1 < hor2 || hor1 == hor2) && (ver1 > ver2 || ver1 == ver2)) {
                if (R1 + R2 == centreDist)
                    touch = 1;
                else if (R1 + R2 > centreDist + 1) {
                    touch = 1;
                }
            }
        } else if (X1 < X2 && Y1 == Y2) {
            hor1 = X1 + R1;
            hor2 = X2 - R2;
            if ((hor1 > hor2 || hor1 == hor2)) {
                touch = 1;
            }
        } else if (X1 > X2 && Y1 == Y2) {
            hor1 = X1 - R1;
            hor2 = X2 + R2;

            if ((hor1 < hor2 || hor1 == hor2)) {
                touch = 1;
            }
        }  else if (X1 == X2 && Y1 < Y2) {
            ver1 = Y1 + R1;
            ver2 = Y2 - R2;
            if ((ver1 > ver2 || ver1 == ver2)) {
                touch = 1;
            }
        } else if (X1 == X2 && Y1 > Y2) {
            ver1 = Y1 - R1;
            ver2 = Y2 + R2;

            if ((ver1 < ver2 || ver1 == ver2)) {
                touch = 1;
            }
        } else if (X1 == X2 && Y1 == Y2 && R1 == R2) {
            touch = 1;
        }

        return touch;
    }
}