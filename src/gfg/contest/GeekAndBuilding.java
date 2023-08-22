package gfg.contest;

//You are given an array heights of n elements whose ith element denotes the height of the ith building.
// Geek likes to jump from one building to another.
// He only jumps to the next taller building and stops when he reaches the tallest building.
//        The energy required for this journey is XOR of all the heights of the buildings on which Geek jumps until he stops. Geek can start his journey from any building. Find the maximum energy required before he starts.
//
//        Example 1:
//
//        Input:
//        n = 5
//        heights[] = {3, 1, 4, 5, 6}
//        Output: 7
//        Explanation:
//        If he starts from building 1,
//        required energy = 3 ^ 4 ^ 5 ^ 6 = 4.
//        If he starts from building 2,
//        required energy = 1 ^ 4 ^ 5 ^ 6 = 6.
//        If he starts from building 3,
//        required energy = 4 ^ 5 ^ 6 = 7.
//        If he starts from building 4,
//        required energy = 5 ^ 6 = 3.
//        If he starts from building 5,
//        required energy = 6
//
//        The maximum energy required is 7, in the case
//        where he starts jumping from building 3.
//
//        Example 2:
//
//        Input:
//        n = 2
//        heights[] = {4, 4}
//        Output: 4

public class GeekAndBuilding {
    public static void main(String[] args) {
        int[] heights = {3, 1, 4, 5, 6};
        int n = heights.length;

        System.out.println(maximum_energy(n, heights));
    }

    public static long maximum_energy(int n, int[] heights) {
        // code here
        int[] enegies = new int[n];
        for(int i = 0; i < n-1; i++){
            int energy = heights[i];
            int prev=0;
            for(int j = i+1; j < n; j++){
                if(j == i+1){
                    prev = heights[i];
                    if(prev < heights[j]){
                        energy ^= heights[j];
                        prev = heights[j];
                    }
                }
                else if(prev < heights[j]){
                    energy ^= heights[j];
                    prev = heights[j];
                }
            }
            if(i != 0 ){
                if(enegies[0] < energy)
                    enegies[0] = energy;
                else
                    enegies[i] = energy;
            }
            else
                enegies[0] = energy;

        }
        if(heights[n-1]>enegies[0]){
            enegies[0] = heights[n-1];
        }
        return enegies[0];
    }
}
