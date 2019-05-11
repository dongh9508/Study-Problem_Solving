package problem_solving.week8._10;

import java.util.*;

public class t_2 {
    public static void main(String[] args) {
        Integer v[]={4, 2, 9, 5, 7, 5, 8, 10, 15};
        List<Integer> list=Arrays.asList(v);
        PriorityQueue<Integer> pq = new PriorityQueue<>(list); // 최소힙 생성
        System.out.println(pq);
        for (int i = 0; i<v.length; i++) {
            System.out.println(pq.remove()+"=>"+pq);
        }
    }
}
