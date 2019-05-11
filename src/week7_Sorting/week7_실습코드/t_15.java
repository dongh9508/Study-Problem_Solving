package problem_solving.week7;

import java.util.*;

public class t_15 {
    public static void main(String[] args) {
        int v[]={1,-5,3,2,1,4,-3,-1,-1,0};
        sort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void sort(int[] v) {
        int max = v[0];
        int min = v[0];

        for(int i=1; i<v.length; i++) {
            if(max < v[i])
                max = v[i];
            if(min > v[i])
                min = v[i];
        }
        int count[] = new int[max - min +1];

        for(int i=0; i<count.length; i++) {
            v[i] = v[i] - min;
        }
        for(int i = 0; i < v.length; i++) {
            count[v[i]] += 1;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                v[j++] = i + min;
                count[i] -= 1;
            }
        }
    }
}
