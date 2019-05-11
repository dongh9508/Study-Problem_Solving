package problem_solving.week7;

import java.util.*;

public class t_5 {
    public static void main(String[] args) {
        int v[]={1,3,5,7,8,2,4,6,7,10};
        mergeArray(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
        System.out.println(Arrays.toString(v));
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] mergearr = new int[v.length];
        for(int i=0; i<v.length/2; i++) {
            if (i == 0 || i % 2 == 0) {
                mergearr[i] = v[left1];
                mergearr[mergearr.length - 1 - i] = v[right2];
                left1++;
                right2--;
            } else {
                mergearr[i] = v[left2];
                mergearr[mergearr.length - 1 - i] = v[right1];
                left2++;
                right1--;
            }
        }
        for(int i=0; i<v.length; i++) {
            v[i] = mergearr[i];
        }

    }
}
