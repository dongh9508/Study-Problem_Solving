package problem_solving.chap1;

import java.util.*;
import java.io.*;

public class t_28 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int n = Integer.valueOf(in.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = random.nextInt(10);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int k = Integer.valueOf(in.readLine());

        for(int z=0; z<k; z++) {
            int temp = arr[n-1];
            for (int i=n-1; i>=1; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }


        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
