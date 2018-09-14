package problem_solving.chap1;

import java.util.*;

public class t_18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        int y = n.length-1;
        Arrays.sort(n);
        for(int i=0; i<n.length; i++) {
            int x = n[y];
            n[i] = x;
            y--;
        }
        System.out.println(Arrays.toString(n));
    }
}
