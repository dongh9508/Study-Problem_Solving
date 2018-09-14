package problem_solving.week2;

import java.util.*;

public class t_5 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int x = random.nextInt(101);
            list.add(x);
        }
    }
}
