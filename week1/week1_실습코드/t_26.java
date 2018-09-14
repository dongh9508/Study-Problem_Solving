package problem_solving.chap1;

import java.util.*;
import java.io.*;

public class t_26 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.valueOf(in.readLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int m = arr.length-1;
        int max = 0;
        int h = 1;

        for(int i=0; i<n; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=0; i<arr.length; i++) {
            int x = arr[m];
            arr2[i] = x;
            m--;
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        for(int i = 0; i<arr.length; i++) {
            if(i != n-1) {
                if (arr2[i] > arr2[i+1]) {
                    arr[i] = h;
                    h++;
                }
                else {
                    arr[i] = h;
                }
            }
            else {
                arr[i] = h;
            }
            System.out.print(arr[i] + " ");
        }

    }
}
