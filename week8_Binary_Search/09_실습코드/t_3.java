package problem_solving.week8._9;

import java.util.*;

public class t_3 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map=new TreeMap<>();
        map.put("Korea", 32);
        map.put("Japan", 50);
        map.put("China", 16);
        System.out.println(map);
        map.remove("Japan");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Korea"));
        System.out.println(map.get("Germany"));
    }
}
