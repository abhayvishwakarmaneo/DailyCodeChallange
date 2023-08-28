package gfg.problems.easy;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,13};
        int n = arr.length;

        System.out.println(peakElement(arr, n));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int index = 0;
        for(int i = 0; i < n; i++){
            if((i == 0 && arr[i] > arr[i+1]) || (i == n-1 && arr[i] > arr[i-1])){
                index = i;
                break;
            }

            else{
                if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}
