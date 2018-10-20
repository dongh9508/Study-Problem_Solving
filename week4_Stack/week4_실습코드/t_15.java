package problem_solving.week4;

import java.util.*;

public class t_15 {
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(Arrays.toString(n));
        int m[]=arrayCopy(n, n.length*2); // 2배 확장
        n=m;
        System.out.println(Arrays.toString(n));
        n=arrayCopy(n, (int) (n.length*0.25)); // 1/4로 축소
        System.out.println(Arrays.toString(n));
    }
    private static int[] arrayCopy(int[] n, int newSize) {
        int[] newArray = new int[newSize];
        int count = 0;

        for(int i=0; i<newArray.length; i++) {
            if(count < n.length) {
                int x = n[i];
                newArray[i] = x;
            }
            else {
                newArray[i] = 0;
            }
            count++;
        }

        return newArray;
    }
}
