
public class Experiments {
    public static void main(String[] args) {
        int[][] dayGifts = {{1, 3}, {2, 3}, {3, 2}, {4, 1}, {5, 3}};
        int money = 0;
        int giftsBought = 0;

        for (int[] arr : dayGifts) {
            money ++;           
            if (arr[1] <= money) {                   
                giftsBought++;                       
                money -= arr[1];                     
            }
        }

        System.out.println(giftsBought);
    }
}
