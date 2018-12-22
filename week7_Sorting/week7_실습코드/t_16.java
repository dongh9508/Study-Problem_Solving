package problem_solving.week7;

import java.util.*;

public class t_16 {
    public static void main(String[] args) {
        int n[]={5,8,1,9,3,5,1,5};
        countingSort(n, 10); // 최대값 10
        System.out.println(Arrays.toString(n));
    }
    private static void countingSort(int[] n, int max) {
        int m[]=new int[n.length], count[]=new int[max+1];
        for (int i = 0; i < n.length; i++) count[n[i]]++;
        for (int i = 1; i < count.length; i++) count[i]+=count[i-1];
        for (int i = n.length-1; i >=0; i--) m[--count[n[i]]]=n[i];
        for (int i = 0; i < m.length; i++) n[i]=m[i];
    }
}
