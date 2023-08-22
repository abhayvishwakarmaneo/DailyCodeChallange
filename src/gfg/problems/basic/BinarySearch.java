package gfg.problems.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3, 4, 5};
        int k = 4;
        int n = arr.length;
        System.out.println(binarysearch(arr, n ,k));
    }
    static int binarysearch(int[] arr, int n, int k) {
        // code here
        int index = -1;
        int first = 0;
        int last = n-1;
        int mid = (first+last)/2;

        while(first <= last){
            if(arr[mid] == k){
                index = mid;
                break;
            }
            else if(arr[mid] < k){
                first = mid + 1;
            }
            else{
                last = mid -1;
            }

            mid = (first+last)/2;
        }

        return index;
    }
}
