package problem_solving.week6;

import java.util.Arrays;

public class t_22_5 {
    public static void main(String[] args) {
        int v[]=new int[2];
        bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
        if(i==v.length){
            for(int j=0; j<v.length; j++) {
                System.out.print(v[j]);
            }
            System.out.print(" ");
            return;
        }
        for(int k=0; k<8; k++) {
            v[i] = k;
            bitString(v, i+1);
        }
    }
}
