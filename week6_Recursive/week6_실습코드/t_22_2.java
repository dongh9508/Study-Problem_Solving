package problem_solving.week6;

import java.util.Arrays;

public class t_22_2 {
    public static void main(String[] args) {
        int v[]=new int[3];
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
        v[i]=1;
        bitString(v, i+1);
        v[i]=0;
        bitString(v, i+1);
    }
}
