package gfg.problems.school;

import java.text.DecimalFormat;

public class ArraySet1 {
    static String average(int A[], int N)
    {
        int sum =0;
        for(int i = 0; i < N; i++){
            sum += A[i];
        }

        float average = (float) (sum*1.0/N);

        StringBuilder str = new StringBuilder();
        str.append(sum);
        str.append(" ");
        str.append(String.format("%.2f", average));
        String res = str.toString();
        return res;
    }

    public static void main(String[] args) {
        int[] a = {887, 778, 916, 794, 336, 387, 493, 650, 422, 363, 28, 691, 60, 764, 927, 541, 427, 173, 737, 212, 369, 568, 430, 783, 531, 863, 124, 68, 136, 930, 803, 23, 59, 70, 168, 394, 457, 12, 43, 230, 374, 422, 920, 785, 538, 199, 325, 316, 371, 414, 527, 92, 981, 957, 874, 863, 171, 997, 282, 306, 926, 85, 328, 337, 506, 847, 730, 314, 858, 125, 896, 583, 546, 815, 368, 435, 365, 44, 751, 88, 809, 277, 179, 789};
        int n = a.length;

        System.out.println(average(a, n));
    }
}
