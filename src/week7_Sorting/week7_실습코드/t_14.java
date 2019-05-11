package problem_solving.week7;

import java.util.*;

public class t_14 {
    public static void main(String[] args) {
        int v[]={87,95,53,77,100,95,14};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int[] count = new int[101];

        for(int i=0; i<v.length; i++) {
            count[v[i]] += 1;
        }

        int j = 0;
        for(int i=0; i<count.length; i++) {
            if(count[i] > 0) {
                if(count[i] > 1) {
                    int x = count[i];
                    while (x-- > 1)
                        v[j++] = i;
                }
                v[j++] = i;
            }
        }
    }
}
