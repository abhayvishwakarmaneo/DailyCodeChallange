import java.util.HashMap;

public class OptimizedMaximumGifts {
    public static void main(String[] args) {
        HashMap<Integer, Integer> dayAndPrice = new HashMap<>();
        dayAndPrice.put(1, 3);
        dayAndPrice.put(2, 3);
        dayAndPrice.put(3, 2);
        dayAndPrice.put(4, 1);
        dayAndPrice.put(5, 3);

        int money = 0;
        int giftsBought = 0;

        for (int n = 1; n <= dayAndPrice.size(); n++){
            money++;
            if(money > dayAndPrice.get(n)){
                money -=  dayAndPrice.get(n);
                giftsBought++;
            }
        }
        System.out.println(giftsBought);
    }
}