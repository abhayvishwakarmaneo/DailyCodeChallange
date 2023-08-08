package code.challanges;

//Given an integer inputay, trim it such that its maximum element becomes less than twice the minimum,
//        return the minimum number of removals required for the conversion.
//        For example,
//        Input:  [4, 6, 1, 7, 5, 9, 2]
//        Output: The minimum number of removals is 4
//        The trimmed inputay is [7, 5, 9] where 9 < 2 × 5.
//
//
//        Input:  [4, 2, 6, 4, 9]
//        Output: The minimum number of removals is 3
//        The trimmed inputay is [6, 4] where 6 < 2 × 4.


public class CodeChallange08082023 {
    public static void main(String[] args) {
        int[] input = {4, 2, 6, 4, 9};

        int maxRange = 0;

        int min, max;
        for (int i = 0; i < input.length && input.length - i > maxRange; i++)
        {
            min = max = input[i];
 
            for (int j = i; j < input.length; j++)
            {
                min = Integer.min(min, input[j]);
                max = Integer.max(max, input[j]);
                if (2 * min <= max)
                    break;

                maxRange = Integer.max(maxRange, j - i + 1);
            }
        }

        System.out.println("The minimum number of removals is " + (input.length - maxRange));
    }
}