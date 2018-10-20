package problem_solving.week2;

import java.util.*;

public class t_10 {
    public static void main(String[] args) {
        int n[] = {3,4,5,6,7,0,0,0,0,0};

        for (int i=0; i<4; i++) {
            n[i] = n[i+1]; // n[0..4]를 n[1..5]로 이동
        }
        n[4] = 0;
        System.out.println(Arrays.toString(n));
    }
}
