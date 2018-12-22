package problem_solving.week7;

import java.util.*;

public class t_5_3_merge_sort {
    public static void main(String[] args) {
        int v[]=new int[]{5,2,8,1,7,9,4,3};
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
        int[] n = new int[right2-left1+1];
        int k = 0, i=left1, j=left2;

        while(i<=right1 && j<=right2)
            n[k++] = (v[i] < v[j]) ? v[i++] : v[j++];
        while(i<=right1)
            n[k++] = v[i++];
        while(j<=right2)
            n[k++] = v[j++];

        System.arraycopy(n, 0, v, left1, n.length);
    }
}
