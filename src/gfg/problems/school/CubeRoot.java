package gfg.problems.school;

public class CubeRoot {
    public static void main(String[] args) {
        int n = 32678;
        System.out.println(cubeRoot(n));
    }
    static int cubeRoot(int N) {
        // code here
        double cbrt = Math.cbrt(N);
        return (int) Math.floor(cbrt);
    }
}
