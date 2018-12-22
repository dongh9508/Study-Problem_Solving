package problem_solving.week7;

import java.util.*;

public class t_20 {
    public static void main(String[] args) {
        int n[]={432109876,423,312,34,43,21,223,42};
        radixSort(n, 10, 9); // 최대 9자리까지 10진수 기수정렬
        System.out.println(Arrays.toString(n));
    }
    private static void radixSort(int[] n, int Radix, int Length) {
        for (int pos = 0, v=1; pos < Length; pos++, v*=Radix) {
            countingSort(n, v, Radix); // v: 배열 n의 정렬에 사용할 자리값 (예: 1, 10, 100)
        }
    }
    private static void countingSort(int[] n, int v, int Radix) {
        int m[]=new int[n.length], count[]=new int[Radix];
        for (int i = 0; i < n.length; i++) count[(n[i]/v)%Radix]++;
        for (int i = 1; i < count.length; i++) count[i]+=count[i-1];
        for (int i = n.length-1; i >=0; i--) m[--count[(n[i]/v)%Radix]]=n[i];
        for (int i = 0; i < m.length; i++) n[i]=m[i];
    }
}
