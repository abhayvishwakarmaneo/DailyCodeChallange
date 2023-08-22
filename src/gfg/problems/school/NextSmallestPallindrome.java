package gfg.problems.school;

//Given a number, in the form of an array Num[] of size N containing digits from 1 to 9(inclusive).
// The task is to find the next smallest palindrome strictly larger than the given number.
//
//        Example 1:
//
//        Input:
//        N = 11
//        Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2}
//        Output: 9 4 1 8 8 0 8 8 1 4 9
//        Explanation: Next smallest palindrome is
//        94188088149.
//        Example 2:
//
//        Input:
//        N = 5
//        Num[] = {2, 3, 5, 4, 5}
//        Output: 2 3 6 3 2
//        Explanation: Next smallest palindrome is
//        23632.

import java.util.Vector;

public class NextSmallestPallindrome {
    public static void main(String[] args) {
        int[] Num = {8, 1, 5, 1, 2, 8, 9, 5, 8, 5, 4, 5, 6, 6, 8, 4, 8, 5, 4, 2, 9, 3, 7, 5, 9, 8, 9};
        int N = Num.length;

        System.out.println(generateNextPalindrome(Num, N));
    }
/*
*
*
*
*
*
*
*
*
* =====================The code is running for all the test cases on GFG=======================
*
*
*
*
*
*
*
*
* */

//    static Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
//        Vector<Integer> pallindrome = new Vector<>();
//
//        for (int i = n - 1; i >= 0; i--) {
//            pallindrome.add(num[i]);
//        }
//
//        for (int j = n / 2; j >= 0; j--) {
//            if ((n % 2 != 0) && (j == n / 2)) {
//                if (pallindrome.get(j) == 9) {
//                    pallindrome.remove(j);
//                    pallindrome.add(j, 0);
//                }
////                else {
////                    int nxt = pallindrome.get(j) + 1;
////                    pallindrome.remove(j);
////                    pallindrome.add(j, nxt);
////                }
//            } else {
//                if (pallindrome.get(j + 1) == 0) {
//                    int nxt;
//                    if (num[j] == 9)
//                        nxt = 0;
//                    else
//                        nxt = num[j] + 1;
//                    pallindrome.remove(j);
//                    pallindrome.add(j, nxt);
//
//                    pallindrome.remove(n - j - 1);
//                    pallindrome.add(n - j - 1, nxt);
//                } else {
//                    pallindrome.remove(j);
//                    pallindrome.add(j, num[j]);
//                }
//            }
//        }
//        StringBuilder convNum = new StringBuilder();
//        StringBuilder pallinConvNum = new StringBuilder();
//
//        for(int  i = 0; i < n; i++){
////            convNum = convNum+num[i];
//            convNum.append(num[i]);
////            pallinConvNum = pallinConvNum+pallindrome.get(i);
//            pallinConvNum.append(pallindrome.get(i));
//        }
//        Long pallingConvertedNum = Long.parseLong(String.valueOf(pallinConvNum));
//        Long convertedNum = Long.parseLong(String.valueOf(convNum));
//
//
//        if(convertedNum > pallingConvertedNum){
//            int temp = pallindrome.get(n/2)+1;
//            pallindrome.remove(n/2);
//            pallindrome.add(n/2, temp);
//        }
//        System.out.println( "This nums is from vector"+convNum);
//
//
//        return pallindrome;
//    }

    static Vector<Integer> generateNextPalindrome(int num[], int n){
        int m=n/2;
        int left =m-1;
        int right=(n%2==1) ? m+1:m;
        while(left >=0 && num[left]==num[right]) {
            left--;
            right++;
        }
        Vector<Integer> pallindrome =new Vector<Integer>();
        int carry=0;
        if(left <0 || num[left]<num[right]) {
            carry=1;
        }
        left =m;
        if(n%2==0) {
            left =m-1;
        }
        right=m;
        while(left >=0) {
            num[left]+=+carry;
            carry=num[left]/10;
            num[left]%=10;
            num[right]=num[left];
            left--;
            right++;
        }
        if(carry==1) {
            num[n-1]=1;
            pallindrome.addElement(1);
        }
        for(int ele:num) {
            pallindrome.add(ele);
        }
        return pallindrome;
    }
}