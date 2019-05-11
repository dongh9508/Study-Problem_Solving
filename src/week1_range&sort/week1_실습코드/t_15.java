package problem_solving.chap1;

import java.util.*;

public class t_15 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] n = new int[6];

        for(int i = 0; i<6000; i++) {
            int v= random.nextInt(6) + 1;
            if(v == 1)
                n[0] += 1;
            else if(v == 2)
                n[1] += 1;
            else if(v == 3)
                n[2] += 1;
            else if(v == 4)
                n[3] += 1;
            else if(v == 5)
                n[4] += 1;
            else if(v == 6)
                n[5] += 1;
        }

        System.out.println(Arrays.toString(n));
    }
}
