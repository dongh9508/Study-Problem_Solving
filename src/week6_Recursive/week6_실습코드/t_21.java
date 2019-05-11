package problem_solving.week6;

import java.util.*;

public class t_21 {
    public static void main(String[] args) {
        int citycount = 20;
        int[] arr = new int[citycount];
        System.out.println(fact(citycount));
        long giga = 1000000000;
        long city = fact(citycount);
        System.out.println(city/giga + "초, " + (city/giga)/60 + "분, " + (city/giga)/60/60 + "시간");
        System.out.println(((city/giga)/60/60)/24 + "일, " + (((city/giga)/60/60)/24)/365 + "년");

    }
    private static long fact(int n) {
        long result = 1;
        for(int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }

}
