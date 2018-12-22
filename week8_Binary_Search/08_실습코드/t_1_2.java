package problem_solving.week8;

import java.util.*;

public class t_1_2 {
    public static void main(String[] args) {
        int v[]=new int[1000000];
        Random random=new Random();
        for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
        int key=1000000;
        long start;
        start = System.currentTimeMillis();
        System.out.println(search(v, key));
        System.out.println(System.currentTimeMillis()-start);

        start = System.currentTimeMillis();
        System.out.println(searchSentinel(v, key));
        System.out.println(System.currentTimeMillis()-start);

    }
    private static int search(int[] v, int key) {
        for(int i=0; i<v.length; i++) {
            if(v[i] == key) return i;
        }
        return -1;
    }

    private static int searchSentinel(int[] v, int key) {
        int lastvalue = v[v.length-1];
        v[v.length-1] = key;
        int i = 0;
        while(v[i] != key) i++;
        if(i < v.length-1) return i;
        if(key == lastvalue) return v.length-1;
        return -1;
    }
}

