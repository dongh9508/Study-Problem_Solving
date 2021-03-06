Week 1 - Problem Solving(문제해결기법) 1주차 실습 문제.
===

### 1. t_6.java
  > 다음 코드는 정수 n의 k번째 자리수를 출력하는 코드이다. 이 코드를 완성하시오.
  ```java
  public class Test {
    public static void main(String[] args) {
      int n=987654321;
      int k=4;
    }
  }
  ```

### 2. t_8.java
  > 다음은 200억에 해당하는 정수를 변수 n에 저장한 후 출력하는 코드이다. 이 코드의 오류를 바로 잡으시오. 
  ```java
  public class Test {
    public static void main(String[] args) {
      int n=20000000000; // 200억
      System.out.println(n);
    }
  }
  ```

### 3. t_9.java
  > 다음 코드는 20억+20억을 출력하는 코드이다. 이 코드의 오류를 바로 잡으시오. 
  ```java
  public class Test {
    public static void main(String[] args) {
      int n=2000000000;
      System.out.println(n+n);
    }
  }
  ```
### 4. t_10.java
  > 다음은 long 자료형으로도 표현할 수 없는 큰 정수들의 합을 구하기 위해 BigInteger 클래스를 사용하는 코드이다. BigInteger 클래스를 사용하지 않고 문자열 s1, s2에 저장된 숫자 문자열에 해당하는 정수들의 합을 출력하는 코드를 작성하시오.
  ```java
  public class Test {
    public static void main(String[] args) {
      String s1="999999999999999999999999999999999999999999999";
      String s2="888888888888888888888888888888888888";
      BigInteger n1=new BigInteger(s1);
      BigInteger n2=new BigInteger(s2);
      System.out.println(n1.add(n2));
    }
  }
  ```
### 5. t_12.java
  > 다음은 배열 n의 내용을 출력하는 코드이며, 그 출력이 [77, 88, 99]라고 한다. 이 코드를 완성하시오.
  ```java
  public class Test {
    public static void main(String[] args) {
      int n[]={77,88,99};
      String v="";
      for (int i = 0; i < n.length; i++) {
      }
      System.out.println("["+v+"]");
    }
  }
  ```
### 6. t_14.java
  > 1개 주사위를 20회 던져 얻어진 각 눈의 값을 출력하는 작업을 시뮬레이션하는 코드를 작성하시오. 다음은 출력 예시이다.
  ```
  - 출력 예시: 2 5 2 6 4 2 6 3 2 4 5 5 3 6 2 5 3 3 2 1
  ```

### 7. t_15.java
  > 1개 주사위를 6000회 던져 얻어진 각 눈의 출현 횟수를 출력하는 코드를 작성하시오. 다음은 출력 예시이다.
  ```
  - 출력 예시: [984, 970, 1011, 1035, 1015, 985]
  ```

### 8. t_17.java
  > 다음은 배열의 내용을 오름차순 정렬한 후 for-문에서 내림차순으로 출력(배열의 마지막 원소부터 첫 원소까지 출력)하는 코드이다. 이 코드를 완성하시오.
  ```
  - 실행 결과 예시: 9 9 8 7 5 5 4 3 2 1
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      int n[]={5,7,9,1,3,5,8,2,4,9};
      Arrays.sort(n);
      for ( ; ; ) {
      }
    }
  }
  ```

### 9. t_18.java
  > 다음은 배열의 내용을 오름차순 정렬한 후 for-문에서 내림차순으로 재정렬(배열의 내용을 reverse)한 후 출력하는 코드이다. 이 코드를 완성하시오.
  ```
  - 실행 결과 예시: 9 9 8 7 5 5 4 3 2 1
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      int n[]={5,7,9,1,3,5,8,2,4,9};
      Arrays.sort(n);
      for ( ; ; ) {
      }
      System.out.println(Arrays.toString(n));
    }
  }
  ```

### 10. t_20.java
  > 크기 N의 정수 배열에 임의의 정수(0~99)를 저장한 후 배열에 저장된 값들의 평균을 소수점 둘째자리까지 출력하는 코드를 추가하시오. 이 코드의 시간복잡도는 얼마인가? (참고 : System.out.printf(), %.2f)

### 11. t_22.java
  > 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값 중 두 번째 큰 값을 출력하는 코드를 작성하시오. 순위 부여 시 중복된 값에 대해서는 동일 순위를 부여하시오. 예를 들어 배열 값들의 내림차순 나열이 9,9,9,7,...인 경우 두 번째 큰 값은 7이 되도록 하시오. 정렬을 적용하면 쉽게 두 번째 큰 값을 얻을 수 있으나, 정렬의 경우 O(nlogn)의 시간복잡도가 소요된다. O(n)의 복잡도로 동작하는 코드를 작성해 보시오. 다음은 동작 예시이다.)

  ```
  - 입력: 4 5 1 5 1 3 4 5 1
  - 출력: 4
  ```
### 12. t_24.java
  > 크기 N(예: 9 혹은 8)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값의 중앙값(median)을 출력하는 코드를 작성하시오. 배열의 크기 N이 홀수, 짝수인 경우 모두 동작하도록 하시오. 다음은 동작 예시이다. (참조: https://ko.wikipedia.org/wiki/중앙값)

  ```
  - 입력: 4 5 1 6 1 3 4 5 1
  - 출력: 4
  - 입력: 5 1 6 1 3 4 5 1
  - 출력: 3.5
  ```
### 13. t_25.java
  > 배열에는 중복된 값들이 존재할 수 있다. 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값들의 중복을 제거한 값들을 출력하는 코드를 추가하시오. 다음은 동작 예시이다.

  ```
  - 입력: 4 5 1 6 1 3 4 5 1
  - 출력: 1 3 4 5 6
  ```
### 14. t_26.java
  > 크기 N(예:9)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값들에 대해 내림차순 정렬 결과 나열 및 그 순위 나열을 한 행씩 출력하는 코드를 추가하시오. 순위 부여시 중복된 값에 대해서는 동일 순위를 부여하시오. 다음은 동작 예시이다.

  ```
  - 입력: 4 5 1 6 1 3 4 5 1
  - 출력:
          6 5 5 4 4 3 1 1 1
          1 2 2 3 3 4 5 5 5
  ```
### 15. t_28.java
  > 크기 N(예:5)의 정수 배열에 임의의 정수(0~9)를 저장한 후 배열에 저장된 값들을 오른쪽으로 K회 회전시킨 결과를 출력하는 코드를 작성하시오. 다음은 동작 예시이다.

  ```
  - 입력(N=5): 1 2 3 4 5
  - 출력(K=2): 4 5 1 2 3
  - 출력(K=5): 1 2 3 4 5
  - 출력(K=6): 5 1 2 3 4
  ```







    
  

  