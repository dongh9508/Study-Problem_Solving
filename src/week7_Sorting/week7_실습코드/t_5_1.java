package problem_solving.week7;

import java.util.Arrays;

public class t_5_1 {
    public static void main(String[] args) {
        int v[]={1,3,5,7,8,2,4,6,7,10};
        mergeArray(v, 0, 4, 5, 9); // v의 부분 배열들 v[0..4], v[5..9]이 정렬된 상태임
        System.out.println(Arrays.toString(v));
    }
    private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
        int[] mergearr = new int[v.length];
        int k = 0;
        while(left1 < right1 && left2 < right2) { // ncount, mcount가 각각 n, m의 범위 내에 있는 동안 작은 값을 v로 복사
            if(v[left1] < v[left2])
                mergearr[k++] = v[left1++];
            else
                mergearr[k++] = v[left2++];
        }

        while(left1 <= right1 || left2 <= right2) {
            if(left1 <= right1)
                mergearr[k++] = v[left1++];
            else
                mergearr[k++] = v[left2++];
        }

        for(int i=0; i<mergearr.length; i++)
            v[i] = mergearr[i];
    }
}
