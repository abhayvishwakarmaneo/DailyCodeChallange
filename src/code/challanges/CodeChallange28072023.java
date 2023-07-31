package code.challanges;

//Find maximum profit earned by buying and selling shares any number of times
//        Given a list containing future prediction of share prices, find the maximum profit earned by buying and selling shares any number of times with the constraint, a new transaction can only start after the previous transaction is complete, i.e., we can only hold at most one share at a time.
//        For example:
//        Stock Prices: {1, 5, 2, 3, 7, 6, 4, 5}
//
//        Total profit earned is 10
//
//        Buy on day 1 and sell on day 2
//        Buy on day 3 and sell on day 5
//        Buy on day 7 and sell on day 8
//
//
//        Stock Prices: {10, 8, 6, 5, 4, 2}
//
//        Total profit earned is 0


import java.util.List;

public class CodeChallange28072023 {
    public static void main(String[] args) {
        List<Integer> prices = List.of(1, 5, 2, 3, 7, 6, 4, 5);
        int profit = 0;
        int buy = 0;
        int sell = 0;
        int prevDay = 0;

        for(int i = 0; i < prices.size(); i++){
            if(i == 0){
                buy = prices.get(i);
            }
            else if(buy == 0){
                if(prices.get(i) < prices.get(i+1)){
                    buy = prices.get(i);
                }
            } else if (buy != 0) {
                if( i == prices.size()-1){
                    if(prices.get(i) > prices.get(i-1) && buy < prices.get(i)){
                        sell = prices.get(i) - buy;
                        profit += sell;
                    }
                }
                else if(prices.get(i) > prices.get(i+1) && buy < prices.get(i)){
                    sell = prices.get(i) - buy;
                    profit += sell;
                    buy = 0;
                }
            }
        }

        if(profit == 0)
            System.out.println("Total profit earned is 0");
        else
            System.out.println("Total profit earned is "+ profit);
    }
}
