package problem_solving.week7;

import java.util.*;
public class t_8 {
    public static void main(String[] args) {
        int v[]={8,5,9,1,5,3,5,1};
        quickSort(v, 0, v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void quickSort(int[] v, int low, int high) {
        if(low>=high) return;
        int p=partition(v, low, high);
        // Lomuto 방법에서는 v[p]가 pivot이 되도록 동작함
        // Hoare 방법에서는 v[p]가 pivot이라는 보장 없음. 즉 quickSort(v,low,p-1)은 불가
        // 반례) 8 2 5 => partition 후 => 5 2 8 (p=1) => [5 2], [8]의 분할임. [5],2,[8]로의 분할 불가
        quickSort(v, low, p);
        quickSort(v, p+1, high);
    }
    private static int partition(int[] v, int low, int high) {
        int i=low-1, j=high+1, pivot=v[low];
        while(true){
            while(v[++i]<pivot); // stop if pivot<=v[i] (GTEQ)
            while(v[--j]>pivot); // stop if v[j]<=pivot (LTEQ)
            if(i<j) swap(v, i, j);
            else return j; // j<=i (j: right end of LTEQ list, i: left end of GTEQ list)
        }
    }
    private static void swap(int[] v, int k, int i) {
        int temp=v[k];
        v[k]=v[i];
        v[i]=temp;
    }
}
