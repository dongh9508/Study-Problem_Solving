package problem_solving.week8;

import java.util.*;

public class t_2 {
    public static void main(String[] args) {
        int v[]= {2,3,6,8,9};
        Arrays.sort(v); // 배열 정렬
        int key=8;
        int index=Arrays.binarySearch(v, key); // 정렬된 배열 내 자료 위치 이진 탐색
        if(index<0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): "+index);
    }
}
