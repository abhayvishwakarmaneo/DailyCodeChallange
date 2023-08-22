package gfg.problems.school;

//Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
//        If the user's choice is 1, calculate the area of the circle having the given radius(R).
//        Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).
//
//        Example 1:
//
//        Input:
//        choice = 1,
//        R = 5
//        Output: 78.53981633974483
//        Explaination: The choice is 1.
//        So we have to calculate the area of the circle.
//        Example 2:
//
//        Input:
//        choice = 2,
//        L = 5, B = 10
//        Output: 50
//        Explaination: Here we have to calculate the
//        area of the rectangle.

import java.util.List;

public class SwitchCaseStatement2 {
    public static void main(String[] args) {
        int choice = 1;
        List<Double> arr = List.of(5.00);

        System.out.println(switchCase(choice, arr));
    }

    static double switchCase(int choice, List<Double> arr){
        // code here
        double pi = 3.14159265359;
        double res = 0.0;
        switch (choice){
            case 1:
                res = pi* (arr.get(0)*arr.get(0));
                break;
            case 2:
                res = arr.get(0)* arr.get(1);
                break;
        }
        return res;
    }
}