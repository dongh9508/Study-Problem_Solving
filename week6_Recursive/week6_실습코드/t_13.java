package problem_solving.week6;

import java.util.*;

public class t_13 {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8};
        reverse(n, 0);
        System.out.println(Arrays.toString(n));
    }
    private static void reverse(int[] n, int i) {
        if ((n.length - 1 - i) - i <= 1) {
            int x = n[n.length - 1 - i];
            n[n.length - 1 - i] = n[i];
            n[i] = x;
            return;
        }
        int x = n[n.length - 1 - i];
        n[n.length - 1 - i] = n[i];
        n[i] = x;
        reverse(n, i+1);
    }
}
