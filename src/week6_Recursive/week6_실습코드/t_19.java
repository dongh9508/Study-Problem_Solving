package problem_solving.week6;

import java.util.*;

public class t_19 {
    public static void main(String[] args) {
        int n[]=new int[3];
        for (int i = 0; i < n.length; i++) n[i]=i;
        perm(n, 0);
    }
    private static void perm(int[] n, int i) {
        if(i==n.length){
            System.out.println(Arrays.toString(n));
            return;
        }
        for (int j = i; j < n.length; j++) {
            int temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
            perm(n, i+1);
            temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
        }
    }
}
