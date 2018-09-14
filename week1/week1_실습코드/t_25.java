package problem_solving.chap1;

import java.util.*;
import java.io.*;

public class t_25 {
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

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j])
                    arr[j] = 0;
            }
        }

        for(int i=0; i<n; i++) {
            if(arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
    }
}
