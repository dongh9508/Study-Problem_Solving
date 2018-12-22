package problem_solving.week7;

import java.util.*;

public class t_10 {
    public static void main(String[] args) {
        Player v[]={new Player("yhkim", 4.3),new Player("cskim", 9.1),new Player("yhlee", 9.8),new Player("cslee", 7.3)};
        bubbleSort(v);
        System.out.println(Arrays.toString(v));
    }
    private static void bubbleSort(Player v[]) {
        for (int i = 0; i < v.length; i++) {
            int count = 0;
            for (int j = 1; j < v.length; j++) {
                if(v[j-1].record > v[j].record) { // 인접 자료 간 순서 맞지 않으면 교환
                    Player temp=v[j];
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
