package gfg.problems.easy;

public class FindTransitionPoint {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(transitionPoint(arr, arr.length));
    }
    static int transitionPoint(int arr[], int n) {
        // code here

        for(int i = 0; i < n ; i++){
            if(i == n-1 && arr[i] == 0)
                return -1;
            if(arr[i] == 1)
                return i;
        }
        return -1;
    }
}
