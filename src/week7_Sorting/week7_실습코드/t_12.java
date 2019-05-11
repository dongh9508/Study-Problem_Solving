package problem_solving.week7;

import java.util.*;

public class t_12 {
    public static void main(String[] args) {
        Player v[]={new Player("yhkim", 4.3),new Player("cskim", 9.1),new Player("yhlee", 9.8),new Player("cslee", 7.3)};
        Arrays.sort(v, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.record - o2.record > -1 ? 1 : -1;
            }
        });
        System.out.println(Arrays.toString(v));
    }
}
