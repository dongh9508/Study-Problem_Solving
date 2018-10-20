package problem_solving.chap1;

import java.util.*;

public class t_18 {
    public static void main(String[] args) {
        int n[]={5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for(int i=0; i<n.length/2; i++) {
            int x = n[i];
            n[i] = n[n.length-i-1];
            n[n.length-i-1] = x;
        }
        System.out.println(Arrays.toString(n));
    }
}
