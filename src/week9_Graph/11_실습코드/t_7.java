package problem_solving.week9;

import java.util.*;

public class t_7 {
    public static void main(String[] args) {
        String input="0 1 0 2 0 3 1 4 1 5 2 5 2 6 3 6 3 7 3 8 4 9 5 9 6 9 6 10 7 10 8 10 9 11 10 11";
        int V=12;
        LinkedList<Integer> adjList[]=new LinkedList[V];
        for (int i = 0; i < adjList.length; i++) adjList[i]=new LinkedList<>();
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }
        bfs(adjList, V, 0);
// int start=0, end=10;
// bfs(adjList, V, start, end);
    }
    private static void bfs(LinkedList<Integer>[] adjList, int V, int start){
        boolean visited[]=new boolean[V];
        double dist[]=new double[V];
        int prev[]=new int[V];
        for (int i = 0; i < dist.length; i++) dist[i]=Double.MAX_VALUE;
        for (int i = 0; i < prev.length; i++) prev[i]=-1;
        LinkedList<Integer> queue=new LinkedList<>();
        visited[start]=true;
        dist[start]=0;
        queue.addLast(start);
        while(!queue.isEmpty()){
            int v=queue.removeFirst();
            for (Integer w : adjList[v]) {
                if(visited[w]==false){
                    visited[w]=true;
                    dist[w]=dist[v]+1;
                    prev[w]=v;
                    queue.addLast(w);
                }
            }
        }
        System.out.println("dist => "+Arrays.toString(dist));
        System.out.println("prev => "+Arrays.toString(prev));

        for(int end=0; end<prev.length; end++) {
            LinkedList<Integer> stack = new LinkedList<>();
            for(int v = end; prev[v] != -1; v = prev[v]) {
                stack.push(v);
            }
            stack.push(start); // 조건 추가해서 조건에 맞을 때 0이 들어가도록
            System.out.println(start + " ~ " + end + " => " + stack);
        }
    }
}
