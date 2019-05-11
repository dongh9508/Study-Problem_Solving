package problem_solving.week8;

import java.util.*;

public class t_1 {
    public static void main(String[] args) {
        int v[] = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < v.length; i++) v[i] = random.nextInt(1000000);
        int key = 1234;
        System.out.println(search(v, key));
    }
    private static int search(int[] v, int key) {
        int i = 0;
        while (v[i] != key && i < v.length-1) {
            i++;
        }
        if(v[i] != key && v[v.length-1] != key)
            return -1;
        return i;
    }
}
