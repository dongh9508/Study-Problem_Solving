package problem_solving.week5;

import java.util.*;

public class t_3 {
    public static void main(String[] args) {
        int n=7, k=4;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i=1; i <=n; i++) queue.add(i); // 1 2 3 4 5 6 7
        int curPos=0;
        System.out.println(queue.get(curPos+k-1)); // curPos부터 k번째 노드 값 => 4
        // curPos가 0이면 0번째부터 k번째 노드 값.
        curPos=5;

        System.out.println(queue.get(((curPos+k-1)%n))); // k는 인덱스 위치니까, -1을 한다.
        //  curPos 자체가 위치임. curPos가 5이면 curPos부터 k번째 위치까지다.
        // 점화식임, 점화식(인덱스 위치 0부터 시작하는 것으로 가정.)
        // curPos가  g(n-1, k)이고, k-1이 +k다.
        // G(1, k) = 0
        // g(n, k) = (g(n-1, k) + k) % n

        System.out.println(queue);
    }
}
