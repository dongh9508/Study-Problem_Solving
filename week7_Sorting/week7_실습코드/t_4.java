package problem_solving.week7;

import java.util.*;
public class t_4 {
    public static void main(String[] args) {
        int n[]={1,3,5,7,20,30};
        int m[]={2,4,6,7,10,25,28};
        int v[]=mergeArray(n, m);
        System.out.println(Arrays.toString(v));
    }
    private static int[] mergeArray(int[] n, int[] m) {
        int v[] = new int[n.length+m.length];
        int ncount = 0;
        int mcount = 0;
        int k = 0;

        while(ncount < n.length && mcount < m.length) { // ncount, mcount가 각각 n, m의 범위 내에 있는 동안 작은 값을 v로 복사
            if(n[ncount] < m[mcount])
                v[k++] = n[ncount++];
            else
                v[k++] = m[mcount++];
        }

        while(ncount < n.length || mcount < m.length) {
            if(ncount < n.length)
                v[k++] = n[ncount++];
            else
                v[k++] = m[mcount++];
        }

        return v;
    }
}
