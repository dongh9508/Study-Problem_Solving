Week 6 - Problem Solving(문제해결기법) 6주차.
===

## 반복과 재귀


* 계승(factorial)

  * 5! = 5 x 4 x 3 x 2 x 1

  * n! = n x (n-1) x (n-2) x … x 1

  * 반복적(iteration) 기반 구현

    ```java
    public static void main(String[] args) {
      System.out.println(fact(10));
    }
    private static double fact(int n) {
      double v=1;
      for (int i = 2; i <= n; i++) v*=i;
      return v;
    }
    ```

  *  재귀(recursion) 기반 구현

      * 재귀식(recurrence relation)
      
        * n=0: fact(n) = 1              <----  Base case: 0! = 1

        * n>0: fact(n) = n x fact(n-1)  <----  Recursive case: n! = n x (n-1)!

        ```java
        public static void main(String[] args) {
          System.out.println(fact(10));
        }
        private static double fact(int n) {
          if(n==0) return 1;
          return n*fact(n-1);
        }
        ```

<br>

* 거듭제곱
  
  * 2^5 = 2 x 2 x 2 x 2 x 2

  * m^n = m x m x … x m

  * 반복 기반 구현

    ```java
    public static void main(String[] args) {
      System.out.println(power(2, 10));
    }
    private static long power(int m, int n) {
      long v=1;
      for (int i = 0; i < n; i++) v*=m;
      return v;
    }
    ```

  * 재귀 기반 구현

    * 재귀식

      * n = 0 : power(m, n) = 1

      * n>0, n이 짝수: power(m, n) = power(m x m, n/2)

      * n>0, n이 홀수: power(m, n) = power(m x m, n/2) x m

      ```java
      public class Test {
        public static void main(String[] args) {
          int m=2, n=60;
          System.out.println(power(m,n));
        }
        private static long power(long m, long n) {
          if(n==0) return 1;
          return power(m*m,n/2)*(n%2==0? 1:m);
        }
      }
      ```

  * 거듭제곱 계산 #1
    
    * 재귀식

        * n=0 : power(m, n) = 1

        * n>0 : power(m, n) = m x power(m, n-1)

    * 예

      * 2^10 -> 2 x 29 -> 2 x 2 x 28 -> … -> 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2

  * 거듭제곱 계산 #2

    * 재귀식

      * n=0 : power(m, n) = 1

      * n>0, n이 짝수: power(m, n) = power(m x m, n/2)

      * n>0, n이 홀수: power(m, n) = power(m x m, n/2) x m

    * 예

       * 2^10 -> 45 -> 4 x 16^2 -> 4 x 256

       * 2^15 -> 2 x 47 -> 2 x 4 x 16^3 -> 2 x 4 x 16 x 256   

<br>

* 배열 총합

  * 재귀식

    * i=0: sum(n, i)=n[0]

      * Base case : 0번째까지 수의 총합은 n[0]과 같다.

    * i>0: sum(n, i) = n[i] + sum(n, i-1)

      * Recursive case : 배열 n의 0번째부터 i번째까지 수의 총합은 배열 n의 0번째부터 i-1번째까지 수의 총합과 배열 n의 i번째 수를 더한 값이다. 

<br>      

* 배열 최대값

  * 재귀식

    * i=0: 0번째까지 수의 최대값은 0번째 수이다.

    * i>0: 0번째부터 i번째까지 수의 최대값은 0번째부터 i-1번째까지 수의 최대값과 i번째 수 중 큰 값.

      ```java
      public class Test {
        public static void main(String[] args) {
          int n[]={5,1,8,3,2};
          System.out.println(max(n, n.length-1));
        }
        private static int max(int[] n, int i) {
        }
      }
      ```
  
  * 재귀적 접근

    * 배열의 최대값은 왼쪽 반의 최대값과 오른쪽 반의 최대값 중 큰 값.

      ```java
      public class Test {
        public static void main(String[] args) {
          int n[]={2,5,1,8,9,7,3,4};
          System.out.println(max(n, 0, n.length-1));
        }
        private static int max(int[] n, int left, int right) { … }
        }
      ```
  ![1](https://user-images.githubusercontent.com/33312179/47831291-4b8a6880-ddd3-11e8-87e2-03a7eecf9cff.png)

  * 재귀적 접근법 연습

    * 배열 내 소문자를 대문자로 변환.

    * 배열 내 대문자 출현 횟수.

<br>

* 회문(palindrome)

  * 순방향, 역방향 모두 같은 순서열이 되는 문자열.

    * ABBA, ABCBA, AAA

  * 회문 검사

    * 재귀적 접근

      * Base case: 길이 1 이하 문자열은 회문이다.

      * Recursive case: 문자열이 회문이 되려면 양 끝 문자가 같아야 하고 양 끝 문자를 제외한 나머지 문자열이 회문이여야 한다.

      ```java
      public class Test {
        public static void main(String[] args) {
          String s="ABCDEDCBA";
          System.out.println(palindrome(s, 0));
        }
        private static boolean palindrome(String s, int i) {
        }
      }
      ```

      ![2](https://user-images.githubusercontent.com/33312179/47831583-84770d00-ddd4-11e8-8f48-72c374d28572.png)

<br>

* 문자열 역순(reverse) 변환

  * 예

    * ABCDE -> EDCBA

  * 재귀적 접근

    * Base case : 길이 1 이하 문자열은 이미 역순 문자열이다.

    * Recursive case : 양 끝 문자 교환 후 양 끝 문자를 제외한 나머지 문자열을 역순 처리한다.

    ```java
    public class Test {
      public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8};
        reverse(n, 0);
        System.out.println(Arrays.toString(n));
      }
      private static void reverse(int[] n, int i) {
      }
    }
    ```

<br>

* 최대공약수(GCD, Greatest Common Divisor)

  * 재귀식

    * b = 0 : gcd(a, b) = a

    * b > 0 : gcd(a, b) = gcd(b, a%b)

  * 반복 기반 구현

  * 재귀 기반 구현

  ```java
  public class Test {
    public static void main(String[] args) {
      System.out.println(gcd(64,48));
    }
    private static int gcd(int a, int b) {
    }
  }
  ```

<br>

* 피보나치 수열

  * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

    * 0번째 수=0, 6번째 수 = 8

  * 특정 순번 피보나치 수 탐색 (0번째부터 시작)

    * 재귀식

      * n <= 1 : fibo(n) = n

      * n >= 2 : fibo(n) = fibo(n-2) + fibo(n-1)

  * 피보나치 수열 : 비효율적 재귀 구현

    ```java
    private static long fibo(int n) {
      if(n<2) return n;
      return fibo(n-2)+fibo(n-1);
    }
    ```

  * 피보나치 수열 : 효율적 재귀 구현

    ```java
    public class Test {
      public static void main(String[] args) {
        System.out.println(fibo(50));
      }
      private static long fibo(int n) {
        long memo[]=new long[n+1];
        return fiboMemo(n, memo);
      }
      private static long fiboMemo(int n, long[] memo) {
        if(memo[n]>0) return memo[n];
        if(n<2) memo[n]=n;
        else memo[n]=fiboMemo(n-2, memo)+fiboMemo(n-1, memo);
        return memo[n];
      }
    }
    ```

<br>

* 순열(permutation)

  * 순서가 부여된 나열

  * 집합 내 모든 원소들에 순서를 부여한 나열

  * 집합 S에 대한 순열의 개수는 |S|!

  * 예

    * {A, B, C} -> ABC, ACB, BAC, BCA, CAB, CBA

  * 순열 생성

    * 배열 n에 저장된 값들의 순열 생성

      * Perm(n, 0) -> 배열 n의 위치 0부터 끝(n.length-1)까지 값들의 순열

      * perm(n, i)  배열 n의 위치 i부터 끝까지 값들의 순열

        * i = n.length

          * 배열 n 내 특정 순열 처리

        * i < n.length

          * j = i ~ n.length-1
          * swap(n[i], n[j])
          * perm(n, i+1)
          * swap(n[i], n[j])
          <br>
      ```java
      public static void main(String[] args) {
        int n[]=new int[3];
        for (int i = 0; i < n.length; i++) n[i]=i;
        perm(n, 0);
      }
      private static void perm(int[] n, int i) {
        if(i==n.length){
          System.out.println(Arrays.toString(n));
          return;
        }
        for (int j = i; j < n.length; j++) {
          int temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
          perm(n, i+1);
          temp=n[i]; n[i]=n[j]; n[j]=temp; // swap
        }
      }
      ```
  
  * 순열 생성 실습

    * 4 비트 이진 비트열 생성

      * 0000,0001,0010,0011,0100,0101,0110,0111,1000,1001,1010,1011,1100,1101,1110,1111

    * 다음 순서대로 3-비트 이진 비트열 생성

      * 111,110,101,100,011,010,001,000

    * {A, B}로부터 생성 가능한 길이 3의 모든 문자열 생성

      * AAA,AAB,ABA,ABB,BAA,BAB,BBA,BBB

        * 곱집합 {A,B}x{A,B}x{A,B}

![4](https://user-images.githubusercontent.com/33312179/47832310-17fe0d00-ddd8-11e8-9ba6-944e09a12f5e.png)

<br>

* n-비트 이진수 생성

  * 배열 v에 이진수 생성

    * bitString(v, 0)  배열 v의 0부터 끝(v.length-1)까지 위치에 이진수 생성.

  * i = v.length

    * 배열 v 내 이진수 처리

  * i < v.length

    * v[i]=0

    * bitString(v, i+1)

    * v[i]=1

    * bitString(v, i+1)

    <br>
  ```java
  public class Test {
    public static void main(String[] args) {
      int v[]=new int[3];
      bitString(v, 0);
    }
    private static void bitString(int[] v, int i) {
      if(i==v.length){
        System.out.println(Arrays.toString(v));
        return;
      }
      v[i]=0;
      bitString(v, i+1);
      v[i]=1;
      bitString(v, i+1);
    }
  }
  ```

<br>

* 모든 부분집합 생성

  * 3비트 이진수 -> 크기 3 집합의 특정 부분집합 표현으로 해석.

    * 비트 값 0

        * 집합 내 대응하는 원소를 부분집합의 원소로 미포함.

    * 비트 값 1

      * 집합 내 대응하는 원소를 부분집합의 원소로 포함.
  
  * 집합 S = {A, B, C}의 모든 부분집합

    * 000 -> {}

    * 001 -> {C}

    * 010 -> {B}

    * 011 -> {B, C}

    * 100 -> {A}

    * 101 -> {A, C}

    * 110 -> {A, B}

    * 111 -> {A, B, C}

<br>

* 부분집합의 합 문제 (subset sum problem)

  * 정수 집합 S와 특정한 정수 K에 대해, S의 부분집합의 모든 원소들의 합이 K가 되는 부분집합이 존재하는가

    * S = {1,3,4,5,8,9}, K=21

      * {4,8,9}, {3,4,5,9}, {1,3,8,9}, {1,3,4,5,8}
<br>