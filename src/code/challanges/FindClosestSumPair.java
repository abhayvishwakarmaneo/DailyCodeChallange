// Find the closest pair to a given sum in two sorted arrays
// Given two sorted arrays, find a pair whose sum is closest to a given sum where the pair consists of elements from each array.
// For example:
// Input:
// first[] = { 1, 8, 10, 12 }
// second[] = { 2, 4, 9, 15 }
// target = 11
// Output: The closest pair is [1, 9]
 
// Input:
// first[] = { 10, 12, 15, 18, 20 }
// second[] = { 1, 4, 6, 8 }
// target = 22
// Output: The closest pair is [18, 4]

public class FindClosestSumPair {
    public static void main(String[] args) {
        int[] first = { 10, 12, 15, 18, 20 };
        int[] second = { 1, 4, 6, 8 };
        int target = 22;
        int diff = 0;
        int minDiff = target;
        int firstNum = 0;
        int secondNum = 0;

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (target == (first[i] + second[j])) {
                    firstNum = first[i];
                    secondNum = second[j];
                    break;
                } else {
                    diff = target - (first[i] + second[j]);
                    if (minDiff > diff && diff > 0) {
                        minDiff = diff;
                        firstNum = first[i];
                        secondNum = second[j];
                    }
                }
            }
        }
        System.out.println("The closest pair is [" + firstNum + ", " + secondNum + "]");
    }
}