package problem_solving.chap1;

import java.util.*;
import java.io.*;

public class t_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Random ran = new Random();
        int n = Integer.valueOf(in.readLine());
        int[] arr = new int[n];
        double result = 0.0;

        for(int i=0; i<n; i++) {
            arr[i] = ran.nextInt(10);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        if(n%2 == 0) {
            int x = n/2;
            double sum = arr[x] + arr[x-1];
            result = sum/2;
        }
        else {
            int x = (n-1)/2;
            result = arr[x];
        }

        System.out.printf("%.2f",  result);

    }
}
