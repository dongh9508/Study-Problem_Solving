package problem_solving.week7;

import java.util.*;

public class t_9 {
    public static void main(String[] args) {
        String v[]={"Korea", "UK", "China", "United States", "Canada", "Brazil"};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bubbleSort(String v[]) {
        for (int i = 0; i < v.length; i++) {
            int count = 0;
            for (int j = 1; j < v.length; j++) {
                if(v[j-1].length() > v[j].length()) { // 인접 자료 간 순서 맞지 않으면 교환
                    String temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                    count++;
                }
            }
            if(count == 0)
                return;
        }
    }
}
