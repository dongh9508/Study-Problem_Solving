Week 2 - Problem Solving(문제해결기법) 2주차 실습 문제.
===

### 1. t_5.java
  > 0~100까지의 범위의 임의 정수를 1000000(백만)개 생성하면서 생성된 순서대로 정수를 LinkedList에 저장한 후 리스트 내 99999번째 자료를 출력하는 코드를 작성하시오.

### 2. t_8.java
  > 1부터 100까지의 숫자들이 순차 저장된 리스트를 생성한 후 3번째 자료를 삭제한 다음 리스트 내용 전체를 출력하는 코드를 작성하시오.

### 3. t_10.java
  > 1부터 100까지의 숫자들이 순차 저장된 리스트를 생성한 후 3번째 자료를 삭제한 다음 리스트 내용 전체를 출력하는 코드를 작성하시오.
  ```
  - 실행결과: [4, 5, 6, 7, 0, 0, 0, 0, 0, 0]
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      int n[]={3,4,5,6,7,0,0,0,0,0};
      System.out.println(Arrays.toString(n));
    }
  }
  ```
### 4. t_13.java
  > 다음은 기존 자료가 저장되어 있는 배열의 0번째 위치에 새로운 자료를 삽입하여 기존 배열을 크기 1 증가된 배열로 변경하는 코드이다. System.arraycopy(s, 0, t, 1, s.length)를 반복문으로 대체하여 작성하시오.
  ```
  - System.arraycopy(s, 0, t, 1, s.length)는 s[i]를 t[j]에 대입하는 작업을 i=0,j=1부터 시작하여 s.length번 반복하는 함수이다.
  - 삽입 전: [화, 수, 목, 금, 토, 일]
  - 삽입 후: [월, 화, 수, 목, 금, 토, 일]
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      char s[]= {'화','수','목','금','토','일'};
      System.out.println(Arrays.toString(s)); // 삽입 전
      char t[]=new char[s.length+1];
      System.arraycopy(s, 0, t, 1, s.length);
      t[0]='월';
      s=t;
      System.out.println(Arrays.toString(s)); // 삽입 후
    }
  }
  ```



