package problem_solving.week7;

import java.util.*;

public class t_7 {
    public static void main(String[] args) {
        int v[]={8,5,9,1,5,3,5,1};
        quickSort(v, 0, v.length-1);
        System.out.println(Arrays.toString(v));
    }
    private static void quickSort(int[] v, int low, int high) {
        if(low>=high) return;
        int p=partition(v, low, high);
        quickSort(v, low, p-1);
        quickSort(v, p+1, high);
    }
    private static int partition(int[] v, int low, int high) {
        int pivot=v[high];
        int p=low; // GTEQ 리스트 첫 위치 (반복 종료 후 pivot 위치임)
        for (int k = low; k < high; k++) {
            if(v[k] < pivot) {
                if (p == k)
                    p++;
                else
                    swap(v, p++, k); // GTEQ 불만족 자료 LT로 이동, GTEQ첫위치 수정
            }
        }
        swap(v, p, high); // GTEQ 리스트 첫 자료와 pivot 교환
        return p;
    }
    private static void swap(int[] v, int k, int i) {
        int temp=v[k];
        v[k]=v[i];
        v[i]=temp;
    }
}
