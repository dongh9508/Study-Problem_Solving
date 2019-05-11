package problem_solving.chap1;

import java.util.*;

public class t_22 {
    public static void main(String[] args) {
        Random ran = new Random();
        int n = 9;
        int[] arr = new int[n];
        int max = 0;
        int result = 0;

        for(int j=0; j<arr.length; j++) {
            arr[j] = ran.nextInt(10);
            System.out.print(arr[j] + " ");
            if(arr[j] > max)
                max = arr[j];
        }

        System.out.println();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != max) {
                if(arr[i] > result)
                    result = arr[i];
            }
        }

        System.out.println(result);
    }
}
