package problem_solving.chap1;

import java.util.*;

public class t_25 {
    public static void main(String[] args)  {
        Random ran = new Random();
        int n = ran.nextInt(10)+5;
        Integer[] arr = new Integer[n];

        for(int i=0; i<n; i++) {
            arr[i] = ran.nextInt(10);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j])
                    arr[j] = null;
            }
        }

        for(int i=0; i<n; i++) {
            if(arr[i] != null)
                System.out.print(arr[i] + " ");
        }
    }
}
