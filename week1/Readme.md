Week 1 - Problem Solving(문제해결기법) 1주차.
===
* 자바 정수(int) 값 범위.
  * -2147483648 ~ 2147483647<br><br>
* 자바 정수(long) 값 범위.
  * -9223372036854775808 ~ 9223372036854775807<br><br>
* 자바 정수(long) 범위 이상의 정수 표현.
  * BigInteger 를 이용.<br><br>

* 최대값 탐색.
   * 총 비교 횟수(n=5): 5
   * 총 비교 횟수(n=1000): 1000
   * **O(n)**
  <br>

   ```java  
    public class Test {
      public static void main(String[] args) {
        int n[]= {32,54,65,21,10};
        int max=n[0];

        for (int i = 0; i < n.length; i++) {
          if(n[i]>max) 
            max=n[i];
        }

        System.out.println(max);
      } 
    }
   ```
<br>
* 정렬 알고리즘과 시간복잡도.

  |      최악의 경우 시간복잡도            | 정렬 알고리즘     | 
  ----------------- | ---------------------------- | 
  | ![1](https://user-images.githubusercontent.com/33312179/45468574-43616580-b760-11e8-96e5-f608bd7e6fd0.jpg)  | 버블정렬, 선택정렬, 삽입정렬, 퀵정렬  | 
  |  ![2](https://user-images.githubusercontent.com/33312179/45468598-6724ab80-b760-11e8-8cb3-2731bf0fd932.jpg)  | 합병정렬, 힙정렬  | 
  