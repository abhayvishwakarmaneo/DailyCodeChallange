package git.intermediate;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println(calAverage(arr, n));
    }

    static int calAverage(int[] arr, int n){
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum/n;
    }
}
