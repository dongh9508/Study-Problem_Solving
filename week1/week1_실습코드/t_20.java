package problem_solving.chap1;

import java.util.*;

public class t_20 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random ran = new Random();
        int n = 100;
        int[] arr = new int[n];
        int result = 0;

        for(int i=0; i<n; i++) {
            arr[i] = ran.nextInt(100);
            result += arr[i];
        }

        double num = result/n;

        System.out.printf("%.2f", num);
        System.out.println(); // 시간 복잡도는 O(n)이 나오는거 같다.
        // 이 코드는 딱 하나의 반복문을 갖고 있기 때문에, 시간 복잡도는 O(n)이 됩니다.

        long endTime = System.currentTimeMillis();
        long lTime = endTime - startTime;
        System.out.println("TIME : " + lTime + "(ms)");
    }
}
