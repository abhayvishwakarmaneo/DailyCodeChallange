import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTriplets {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList( 1, 3, 5, 6, 8, 9, 15 ));
        int diff = 0;
        int firstNum = 0;

        for(int i = 0; i < nums.size() - 1; i++){
            firstNum = nums.get(i);
            for(int j = i + 1; j < nums.size() ; j++){
                diff = nums.get(j) - firstNum;
                if(nums.contains(nums.get(j) + diff)){
                    int thirdNum = nums.get(nums.indexOf(nums.get(j) + diff));
                    System.out.print(firstNum+" "+nums.get(j)+" "+thirdNum);
                    System.out.println("");
                }
            }
        }
    }
}