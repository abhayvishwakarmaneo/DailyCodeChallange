public class MaximumGifts {
    public static void main(String[] args) {
        int[][] dayGifts = {{1,3}, {2,3}, {3,2}, {4,1}, {5,3}};
        int money = 0;
        int giftsBought = 0;
        int priceOfGift = 0;

        for(int[] arr: dayGifts) {                  // This will traverse the outer array
            for(int n=0; n < arr.length-1; n++){    // This will traverse the inner arrays
                money++;                            // As day passes Money will be incremented by 1
                priceOfGift = arr[n+1];             // Inner arrays next elemnt will be stored as price of gift
                if(priceOfGift < money){            // Here if price of gift is less than money or not is compared
                    money -= priceOfGift;           // If the price of gift is less than total money then price will be subtracted by money and will be stored in money itself as remaining money
                    giftsBought++;                  // Here per day baught gifts will be incresed by 1;
                }
            }
        }
        System.out.println(giftsBought);            // Displayed how many gifts will be baught by uncle for his nephew
    }
}
