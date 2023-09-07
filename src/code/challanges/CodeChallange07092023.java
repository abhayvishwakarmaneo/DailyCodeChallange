package code.challanges;

import java.util.HashMap;

public class CodeChallange07092023 {
    public static void main(String[] args) {
        int[] arr ={1, 2, 4, 3, 6};
        int n = arr.length;
        int x = 10;
        System.out.println(hasArrayTwoCandidates(arr, n, x));
    }
    static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        // code here
        boolean flag = false;

//        for(int i = 0; i < n-1; i++){
//            if(arr[i] < x){
//                for(int j = i+1; j < n; j++){
//                    if(arr[i]+arr[j] == x){
//                        return true;
//                    }
//                }
//            }
//        }
//==================Above solution is working but with 2 loops============================
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            count = map.getOrDefault(x-arr[i], 0);
            if(count > 0){
                return true;
            }
            else {
                map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
            }
        }

        return flag;
    }
}
