// Find maximum difference between two array elements that satisfies given constraints
// Given an integer array, find the maximum difference between two elements in it such that the smaller element appears before the larger element.
// For example:
// Input:  { 2, 7, 9, 5, 1, 3, 5 }
 
// Output: The maximum difference is 7.
 
// The pair is (2, 9)

public class DifferenceOfElements {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 5, 1, 3, 5 };
        int smallNum = 0;
        int largeNum = 0;
        int Diff = 0;
        int maxDiff = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                Diff = arr[i] - arr[j];
                if(Diff > maxDiff){
                    maxDiff = Diff;
                    if(arr[i] > arr[j]){
                        smallNum = arr[j];
                        largeNum = arr[i];
                    }
                    else{
                        smallNum = arr[i];
                        largeNum = arr[j];
                    }
                }
            }
        }
        System.out.println("The maximum difference is "+maxDiff);
        System.out.println("The pair is ("+smallNum+", "+largeNum+")");
    }
}
