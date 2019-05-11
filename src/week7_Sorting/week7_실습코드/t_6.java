package problem_solving.week7;

import java.util.*;

public class t_6 {
    public static void main(String[] args) {
        int v[]=new int[]{8,5,9,1,5,3,5,1};
        mergeSort(v, 0, v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void mergeSort(int[] v, int left, int right) {
        if(left==right) return;
        int m=(left+right)/2;
        mergeSort(v, left, m);
        mergeSort(v, m+1, right);
        mergeArray(v, left, m, m+1, right);
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] mergearr = new int[v.length];
        int i=left1, j=left2, k=left1;

        while(i<=right1 && j<=right2) {
            if(v[i]<=v[j])
                mergearr[k++]=v[i++];
            else
                mergearr[k++]=v[j++];
        }

        while(i<=right1)
            mergearr[k++] = v[i++];
        while(j<=right2)
            mergearr[k++] = v[j++];

        for(i=left1; i<=right2; i++)
            v[i] = mergearr[i];
    }
}
