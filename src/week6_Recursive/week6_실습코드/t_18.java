package problem_solving.week6;

import java.util.*;

public class t_18 {
    public static void main(String[] args) {
        int n[]={3,4};
        System.out.println(Arrays.toString(n));
        swap(n,0,1);
        System.out.println(Arrays.toString(n));
    }
    private static void swap(int n[],int i, int j) {
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }
}
