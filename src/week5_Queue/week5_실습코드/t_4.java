package problem_solving.week5;

import java.util.*;

public class t_4 {
    public static void main(String[] args) {
        System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++)
            queue.add(i);

        while(queue.size() != 1) {
            for(int i=0; i<k-1; i++) {
                int a = queue.removeFirst();
                queue.addLast(a);
            }
            queue.removeFirst();
        }
        int result = queue.get(0);
        return result;
    }
}
