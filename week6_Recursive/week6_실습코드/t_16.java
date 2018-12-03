package problem_solving.week6;

import java.util.*;

public class t_16 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        long memo[]=new long[n+1];
        System.out.println(Arrays.toString(memo));
        return fiboMemo(n, memo);
    }
    private static long fiboMemo(int n, long[] memo) {
        if(memo[n]>0) return memo[n];
        if(n<2) memo[n]=n;
        else memo[n]=fiboMemo(n-2, memo)+fiboMemo(n-1, memo);
        return memo[n];
    }
}
