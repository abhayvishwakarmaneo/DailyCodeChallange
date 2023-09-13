package code.challanges;
//Given a rod of length n and a list of rod prices of length i, where 1 <= i <= n, find the optimal way to cut the rod into smaller rods to maximize profit.
//        For example, consider the following rod lengths and values:
//        Input:
//
//        length[] = [1, 2, 3, 4, 5, 6, 7, 8]
//        price[] = [1, 5, 8, 9, 10, 17, 17, 20]
//
//        Rod length: 4
//
//        Best: Cut the rod into two pieces of length 2 each to gain revenue of 5 + 5 = 10
//
//        Cut           Profit
//        4                9
//        1, 3            (1 + 8) = 9
//        2, 2            (5 + 5) = 10
//        3, 1            (8 + 1) = 9
//        1, 1, 2         (1 + 1 + 5) = 7
//        1, 2, 1         (1 + 5 + 1) = 7
//        2, 1, 1         (5 + 1 + 1) = 7
//        1, 1, 1, 1      (1 + 1 + 1 + 1) = 4


public class RODCuttingProblem {
    static int maxBenefit = 0;
    public static int calculateMaxBenefit(int benefit){
        if(maxBenefit < benefit){
            maxBenefit = benefit;
        }
        return maxBenefit;
    }

    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};

        int rodLength = 7;
        int benefit = 0;
        int res;


        for(int j = 0; j < rodLength; j++){
            for(int k = j; k < rodLength ; k++){
                if(rodLength == length[j] || rodLength == length[k]){
                    benefit = price[j];
                    calculateMaxBenefit(benefit);
                }
                else if(length[j] == length[k]){
                    if(rodLength % length[j] == 0){
                        res = rodLength/length[j];
                        benefit = res * price[k];
                        calculateMaxBenefit(benefit);
                    }
                }
                else {
                    if(length[j] + length[k] == rodLength){
                        benefit = price[j] + price[k];
                        calculateMaxBenefit(benefit);
                    }
                    else if(length[j] + length[k] != rodLength){
                        int temp = rodLength - (length[j] + length[k]);
                        if(temp > 0){
                            benefit = price[temp-1] + price[j] + price[k];
                        calculateMaxBenefit(benefit);
                        }
                        continue;
                    }
                }
            }
        }
        System.out.println(maxBenefit);
    }
}