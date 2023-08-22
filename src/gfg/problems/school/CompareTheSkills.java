package gfg.problems.school;

public class CompareTheSkills {
    public static void main(String[] args) {
        long[] a = {1804289384, 846930887, 1681692778};
        long[] b = {1714636916, 1957747794, 424238336};

        scores(a, b);
    }
    public static void scores(long a[], long b[]) {
        // store the answer as
        // GFG.ca=3;
        // GFG.cb=5;
        // Your code goes here
        int gfga = 0;
        int gfgb = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] > b[i])
                gfga++;
            else if (a[i]<b[i]) {
                gfgb++;
            }
        }

        System.out.println(gfga+" "+gfgb);

    }
}
