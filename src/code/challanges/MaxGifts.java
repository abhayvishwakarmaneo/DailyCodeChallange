public class MaxGifts {
    public static void main(String[] args) {

        //taking input as 2D array  where everyday amount and price of gift is will be given
        int[][] arr = {{1, 3}, {2, 3}, {3, 2}, {4, 1}, {5, 3}};

        //taking out the price array from that given array by picking arr[0][1] and putting it in price[0]
        int[] price = {3, 3, 2, 1, 3};
        int $ = 0;
        int possibleGifts = 0;
        for (int i : price) {
            //every day 1 unit is earned so adding daily unit as 1
            $ += 1;
            //applying condition for checking do we have the amount to buy gift or not
            if (i <= $) {
                //when we buy gift we will have to reduce the price as well
                $ -= i;
                possibleGifts++;
            }
        }
        //printing the total no. of possibleGifts
        System.out.println(possibleGifts
        );
    }


}


