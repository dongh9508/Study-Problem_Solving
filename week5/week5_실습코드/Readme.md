Week 5 - Problem Solving(문제해결기법) 5주차 실습 문제.
===

### 1. t_3.java
  > 다음은 1~7까지 수들이 원형으로 연결되었다고 가정하고 curPos 위치부터 k번째 노드 값을 출력하는 코드이다. curPos가 0인 경우 k번째 노드 값은 4가 출력되며, curPos가 5인 경우 2가 출력되어야 한다. 아래 코드의 오류를 수정하시오.

  ```
  - 실행결과 -
  4
  2
  ```

  ```java
  public class Test {
    public static void main(String[] args) {
      int n=7, k=4;
      LinkedList<Integer> queue=new LinkedList<>();
      for (int i=1; i <=n; i++) queue.add(i); // 1 2 3 4 5 6 7
      int curPos=0;
      System.out.println(queue.get(curPos+k-1)); // curPos부터 k번째 노드 값 => 4
      curPos=5;
      System.out.println(queue.get(curPos+k-1)); // curPos부터 k번째 노드 값 => 2
    }
  }
  ```
<br>

### 2. t_4.java
  > 요세푸스 문제는, 원형으로 둘러선 사람 n명에 대해 특정 위치부터 시작하여 한 방향으로 k번째 사람을 원형에서 제외하는 작업을 반복한다고 할 때 마지막으로 제외되는 사람의 최초 위치를 알아내는 것이다. 아래 예시와 같이 n=7, k=3인 경우 요세푸스 문제의 해는 4이다. 구현 방법 #1, #2를 참조하여 요세푸스 문제를 해결하는 아래 코드를 완성하시오. (참조: https://en.wikipedia.org/wiki/Josephus_problem)
  
  #### A
  > 구현 방법 #1: 최초 1~n까지 수들을 큐에 삽입한 후, "큐 크기가 2이상인 동안, 큐에서 노드 하나를 삭제하고 삭제한 노드를 다시 큐에 삽입하는 작업을 k-1회 수행한 다음 큐에서 노드 하나를 삭제하는 작업"을 반복 수행한다. (참조:https://rosettacode.org/wiki/Josephus_problem)

  #### B
  > 구현 방법 #2: 1~n까지 수들의 연결리스트를 원형 큐로 고려하여 "큐 크기가 2이상인 동안, 직전 제거 위치부터 시작하여 k번째 위치 노드를 삭제하는 작업"을 반복 수행한다. (참조:https://rosettacode.org/wiki/Josephus_problem)

  ```
  1 2 3 4 5 6 7 (3 제거)
  1 2 4 5 6 7 (6 제거)
  1 2 4 5 7 (2 제거)
  1 4 5 7 (7 제거)
  1 4 5 (5 제거)
  1 4 (1 제거)
  4
  ```     

  ```java
  public class Test {
    public static void main(String[] args) {
      System.out.println(solveJosephusProblem(7,3));
    }
    private static int solveJosephusProblem(int n, int k) {
      return 0;
    }
  }
  ```
<br>

### 3. t_5.java
  > 다음 코드는 길이 30의 문자열 s에 저장된 문자들을 5행 6열의 이차원배열 maze에 저장한 후 출력하는 코드이다. 이 코드를 완성하시오.

  ```
  - 실행결과 -
  012345
  678901
  234567
  890123
  456789
  ```

  ```java
  public class Test {
    public static void main(String[] args) {
      int R = 5, C = 6;
      String s = "012345678901234567890123456789";
      char maze[][]=new char[R][C];
      for (int i = 0; i < maze.length; i++){
        for (int j = 0; j < maze[i].length; j++) 
          System.out.print(maze[i][j]);
        System.out.println();
      }
    }
  }
  ```
<br>

### 4. t_7.java
  > 아래 사각행렬은 시작 위치 (0,0)으로부터 해당 위치로 이동한 총 거리(시작 위치로의 이동 거리를 1로 가정)를 표시한 것이다. 미로 종료 위치를 (R-1,C-1)이라고 할 때, 아래 사각행렬은 미로의 시작위치로부터 종료위치까지의 최단거리가 17임을 보여준다. 이전 문제의 미로 탐색 코드를 수정하여 다음과 같은 사각행렬이 출력되도록 하시오.

  ```
  - 실행결과 -
  01 02 03 04 05 06 07 00
  00 00 04 00 06 00 08 00
  07 06 05 06 07 08 09 00
  08 00 00 00 00 00 10 00
  09 10 11 12 13 00 00 00
  00 00 00 13 14 15 16 17
  ```
<br>

### 5. t_8.java
  > 이전 문제의 미로 탐색 코드를 수정하여 아래와 같이 시작위치 (0,0)로부터 종료위치 (5,7)까지의 최단 경로를 추가 출력하도록 하시오.

  ```
  - 실행결과 -
  01 02 03 04 05 06 07 00
  00 00 04 00 06 00 08 00
  07 06 05 06 07 08 09 00
  08 00 00 00 00 00 10 00
  09 10 11 12 13 00 00 00
  00 00 00 13 14 15 16 17

  (0,0)(0,1)(0,2)(1,2)(2,2)(2,1)(2,0)(3,0)(4,0)(4,1)(4,2)(4,3)(5,3)(5,4)(5,5)(5,6)(5,7)
  ```

<br>

### 6. t_10.java
  > 위 코드를 수정하여, 아래 실행 예와 같이 포화 큐에 새로운 자료 삽입 시 큐의 크기를 두 배 확장한 후 배열 내 전체 자료를 왼쪽으로 이동시키고 새로운 자료를 삽입하도록 하시오.

  ```java
  public class SimpleStack {
    int DefaultSize=1;
    int MaxSize;
    int stack[];
    int top=-1;

    public SimpleStack() {
      stack = new int[DefaultSize];
      MaxSize=DefaultSize;
    }

    public void push(int data) {
      if(full()){
        MaxSize *= 2;
        stack = Arrays.copyOf(stack, MaxSize);
      }
      stack[++top]=data;
    }

    private boolean full() {
      return top==MaxSize-1;
    }

    @Override
    public String toString() {
      return "top="+top+", stack="+Arrays.toString(stack);
    }

    public int pop() {
      if(empty()) throw new RuntimeException("stack empty");
      return stack[top--];
    }

    private boolean empty() {
      return top==-1;
    }
  }

  public class Test {
    public static void main(String[] args) {
      SimpleStack stack = new SimpleStack();
      for (int i = 0; i < 10; i++){
        stack.push(i);
        System.out.println(stack); // 스택 출력
      }
      for (int i = 0; i < 10; i++){
        int data=stack.pop(); // 스택에서 자료 추출
        System.out.println("Data deleted from stack:"+data);
        System.out.println(stack); // 스택 출력
      }
    }
  }
  ```



