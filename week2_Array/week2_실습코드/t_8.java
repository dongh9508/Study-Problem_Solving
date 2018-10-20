package problem_solving.week2;

import java.util.*;

public class t_8 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=100; i++) {
            list.add(i);
        }
        list.remove(2);
        System.out.println(list);
    }
}
