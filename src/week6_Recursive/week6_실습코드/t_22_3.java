package problem_solving.week6;

import java.util.Arrays;

public class t_22_3 {
    public static void main(String[] args) {
        String v[]=new String[3];
        bitString(v, 0);
    }
    private static void bitString(String[] v, int i) {
        if(i==v.length){
            for(int j=0; j<v.length; j++) {
                System.out.print(v[j]);
            }
            System.out.print(" ");
            return;
        }
        v[i]="A";
        bitString(v, i+1);
        v[i]="B";
        bitString(v, i+1);
    }
}
