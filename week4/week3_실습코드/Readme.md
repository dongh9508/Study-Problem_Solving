Week 4 - Problem Solving(문제해결기법) 4주차 실습 문제.
===

### 1. t_5.java
  > 다음은 문자열 s 내 괄호쌍매칭여부를 스택을 이용하여 판단한 후 그 결과를 true, false로 반환하는 코드이다. 이 코드를 완성하시오. 괄호 문자로는 '(' 와 ')' 만 다루시오.

  ```java
  public class Test {
    public static void main(String[] args) {
      String s="(1+3*(4+5))/(6*(7+8))";
      System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
      Stack<Character> stack=new Stack<>();
        for (Character c : s.toCharArray()){
        }
    }
  }
  ```
<br>

### 2. t_6.java
  > 다음은 문자열 s 내 괄호쌍매칭여부를 스택을 이용하여 판단한 후 그 결과를 true, false로 반환하는 코드이다. 이 코드를 완성하시오. 괄호 문자로는 (,),{,},[,]를 모두 처리할 수 있도록 하시오.

  ```java
  public class Test {
    public static void main(String[] args) {
      String s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
      System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
      Stack<Character> stack=new Stack<>();
    }
  }
  ```
<br>

### 3. t_10.java
  > 다음은 문자열 e에 저장된 후위표현식의 계산 결과를 출력하는 코드이다. 후위표현식에서 연산자는 +,-,*,/만 다루고, 각 토큰(연산자 및 피연산자)들은 하나 이상의 공백 문자로 분리되어 있으며, 주어진 후위표현식에는 오류가 없으며 가정하시오. 이 코드를 완성하시오.

  ```java
  public class Test {
    public static void main(String[] args) {
      String e="3 1 2 / *";
      System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
      Stack<Double> stack=new Stack<>();
      for (String token : e.split("\\s+")) {
      }
      return stack.pop();
    }
  }
  ```
<br>

### 4. t_11.java
  > 다음은 문자열 e에 저장된 후위표현식의 계산 결과를 출력하는 코드이다. 후위표현식에서 연산자는 +,-,*,/만 다루고, 각 피연산자들은 하나 이상의 공백 문자로 분리되어 있으며(피연산자와 연산자 사이 및 연산자들 사이에는 공백이 없을 수 있음에 주의할 것), 주어진 후위표현식에는 오류가 없으며 가정하시오. 이 코드를 완성하시오.

  ```java
  public class Test {
    public static void main(String[] args) {
      String e="34 12 25/*";
      System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
      Stack<Double> stack=new Stack<>();
    }
  }
  ```
<br>

### 5. t_15.java
  > 다음은 배열을 확장, 축소하는 코드이다. arrayCopy는 int 배열에 대해 이전 문제의 Arrays.copyOf() 함수와 같은 동작을 수행하는 함수이다. 아래 코드를 완성하시오.

  ```
  - 실행결과 :
  [1, 2, 3, 4]
  [1, 2, 3, 4, 0, 0, 0, 0]
  [1, 2]
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      int n[] = { 1, 2, 3, 4};
      System.out.println(Arrays.toString(n));
      int m[] = arrayCopy(n, n.length*2); // 2배 확장
      n = m;
      System.out.println(Arrays.toString(n));
      n = arrayCopy(n, (int) (n.length*0.25)); // 1/4로 축소
      System.out.println(Arrays.toString(n));
    }
    private static int[] arrayCopy(int[] n, int newSize) {
    }
  }
  ```
<br>

### 6. t_16.java
  > 아래 코드는 스택 클래스를 동적 배열로 구현한 코드이다. 스택 full인 경우 배열의 크기를 2배로 증가시킨다. 스택 포화를 검사하는 full() 메소드와 스택이 비어 있는지 검사하는 empty() 메소드가 구현되어 있다. SimpleStack 클래스에 peek()을 구현하시오. peek()은 pop()과 같으나 top의 위치를 변경하지 않는다.

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



