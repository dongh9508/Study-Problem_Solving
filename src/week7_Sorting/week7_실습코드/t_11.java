package problem_solving.week7;

import java.util.*;

public class t_11 {
    public static void main(String[] args) {
        Comparator<String> comparator =
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) { // -1, 0, 1 을 반환.
                        return o1.length() - o2.length();
                    }
                };
        String v[]={"Korea", "UK", "China", "United States", "Canada", "Brazil"};
        Arrays.sort(v, comparator);
        System.out.println(Arrays.toString(v));
    }
}
