package problem_solving.week8._9;

import java.util.*;

public class t_2 {
    public static void main(String[] args) {
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.contains(30));
        System.out.println(tree.contains(33));
        System.out.println(tree);
    }
}
