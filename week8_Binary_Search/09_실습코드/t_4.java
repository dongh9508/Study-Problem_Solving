package problem_solving.week8._9;

import java.util.*;

class Player {
    int id;
    public Player(int id) {
        this.id=id;
    }
}

public class t_4 {
    public static void main(String[] args) {
        TreeMap<Integer, Player> map = new TreeMap<>();

        for(int i=1; i<= 1000000; i++)
            map.put(i, new Player(i));
        System.out.println(map.size());

        for(int i=1; i<= 1000000; i+=2)
            map.remove(i);
        System.out.println(map.size());

    }
}
