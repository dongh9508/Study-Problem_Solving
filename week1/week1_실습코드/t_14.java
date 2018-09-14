package problem_solving.chap1;

import java.util.*;

public class t_14 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr = new int[20];
        for(int i=0; i<arr.length; i++) {
            int v= random.nextInt(6) + 1;
            arr[i] = v;
            System.out.print(arr[i] + " ");
        }
    }
}
