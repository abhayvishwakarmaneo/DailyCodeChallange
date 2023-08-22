package gfg.problems.school;

//Example 1:
//
//        Input :
//        a[] = {2, 8, 7, 1, 5}
//        Output :
//        1 2 5
//        Explanation :
//        The output three elements have two or
//        more greater elements.
//        Example 2:
//
//        Input :
//        a[] = {7, -2, 3, 4, 9, -1}
//        Output :
//        -2 -1 3 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtLeastTwoGreaterElements {
    public static long[] findElements( long a[], long n)
    {
        // Your code goes here
        long[] output = new long[a.length-2];

        Arrays.sort(a);

        for(int i = 0; i < output.length; i++){
            output[i] = a[i];
        }

        return  output;
    }

    public static void main(String[] args) {
        long[] a = {2, 8, 7, 1, 5};
        long n = a.length;

        System.out.println(Arrays.toString(findElements(a, n)));
    }
}