package problem_solving.week9._12;

import java.util.*;

public class t_3 {
    public static void main(String[] args) {
        int V=1000;
        UF uf=new UF(V);
        Random random=new Random();
        for (int i = 0; i < V/2; i++){
            int u=random.nextInt(V);
            int v=random.nextInt(V);
            uf.union(u, v);
        }
        System.out.println("연결요소 개수="+uf.count);
        for (int i = 0; i < 5; i++) {
            int u=random.nextInt(V);
            int v=random.nextInt(V);
            System.out.println("connected("+u+","+v+") ? => "+(uf.find(u)==uf.find(v)));
        }
    }
}
