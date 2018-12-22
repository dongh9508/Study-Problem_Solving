package problem_solving.week9._12;

import java.util.*;

public class t_2 {
    public static void main(String[] args) {
        int N=10;
        UF uf=new UF(N);
        System.out.println(uf);
        uf.union(0,1);
        uf.union(2,3);
        uf.union(4,5);
        uf.union(6,7);
        uf.union(8,9);
        uf.union(0,2);
        uf.union(4,6);
        uf.union(0,4);
        System.out.println(uf);
        System.out.println(uf.find(1)==uf.find(6));
        System.out.println("연결요소 개수 = "+uf.count);
    }
}

