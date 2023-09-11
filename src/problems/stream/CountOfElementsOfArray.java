package problems.stream;

import java.util.Arrays;
import java.util.List;


public class CountOfElementsOfArray {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.size());
        System.out.println(myList.stream().count());
    }
}
