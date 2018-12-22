package problem_solving.week8._10;

import java.util.*;

public class t_4 {
    public static void main(String[] args) {
        int N=1000000;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(i);
        Collections.shuffle(list);
        Integer v[]=new Integer[N];
        for (int i = 0; i < list.size(); i++) v[i]=list.get(i);
        System.out.println("Start ...");
        long start;
        start=System.currentTimeMillis();
//        PriorityQueue<Integer> pg=new PriorityQueue<>();
//        for (int i = 0; i < v.length; i++) pg.add(i);
        PriorityQueue<Integer> pg=new PriorityQueue<>(Arrays.asList(v));
        for (int i = 0; i < 10; i++) System.out.print(pg.remove()+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (PriorityQueue)");
        start=System.currentTimeMillis();
        TreeSet<Integer> map=new TreeSet<>();
        for (int i = 0; i < v.length; i++) map.add(v[i]);
        for (int i = 0; i < 10; i++){
            Integer n=map.first();
            System.out.print(n+" ");
            map.remove(n);
        }
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (TreeMap)");
        start=System.currentTimeMillis();
        Arrays.sort(v);
        for (int i = 0; i < 10; i++) System.out.print(v[i]+" ");
        System.out.println(" ... "+(System.currentTimeMillis()-start)+" ms (Arrays.sort())");
    }
}
