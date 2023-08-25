package git.intermediate;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the Power : ");
        int pow = sc.nextInt();

        double powNum = Math.pow(num, pow);
        System.out.println(powNum);
    }
}
