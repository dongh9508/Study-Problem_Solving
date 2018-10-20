Week 4 - Problem Solving(문제해결기법) 4주차.
===
* 스택

  * 자료의 삽입과 삭제가 한 쪽 끝(top)에서만 발생하는 리스트.

  * 삽입, 삭제가 발생하는 위치를 스택의 top이라고 부름.

<br>

* 스택의 연산
  
  * Push
    * 스택의 top 위에 새로운 자료를 삽입.
    ![push](https://user-images.githubusercontent.com/33312179/46470389-66d47900-c811-11e8-876e-ced071d8083c.png)

  * pop
    * 스택의 top 위치에 있는 자료를 삭제 및 반환.
    ![pop](https://user-images.githubusercontent.com/33312179/46470501-cd599700-c811-11e8-8ce8-5c27d3d5ebe2.png)

  * Peek
    * 스택의 top 위치에 있는 자료를 삭제하지 않고 반환.

  * isEmpty
    * 스택이 비어 있는지 여부를 반환.

  * isFull
    * 스택이 포화 상태인지 여부를 반환.       

<br>

* 스택 응용 : 역순 처리.
  
  ![default](https://user-images.githubusercontent.com/33312179/46470699-83bd7c00-c812-11e8-95cb-ce859fe8f037.png)

<br>

* 괄호쌍 매칭.

  * 여는 괄호 -> 스택 push.
  
  * 닫는 괄호 -> 스택 pop한 괄호와 매치.

  ![default](https://user-images.githubusercontent.com/33312179/46471013-8ec4dc00-c813-11e8-9be7-504a87d20586.png)

* 후위표현식 계산

  * 피연산자
    * 스택 Push

  * 연산자
    * 스택에서 피연산자 pop -> pop한 피연산자(들)에 연산자 적용 -> 연산 결과 스택 psuh

  ![default](https://user-images.githubusercontent.com/33312179/46471412-b5374700-c814-11e8-9ee4-9e2ae468700e.png)

  ```java
  public class Test {
    public static void main(String[] args) {
      int n1, n2;
      Stack<Integer> stack=new Stack<>();
      // 후위표현식: 3 4 5 + *
      stack.push(3); // 피연산자 3 => push
      stack.push(4); // 피연산자 4 => push
      stack.push(5); // 피연산자 5 => push
      // 연산자 +
      n2=stack.pop();
      n1=stack.pop();
      stack.push(n1+n2);
      // 연산자 *
      n2=stack.pop();
      n1=stack.pop();
      stack.push(n1*n2);
      System.out.println("계산결과="+stack.pop());
    }
  }
  ```
<br>

* 배열 기반 스택 구현

  * top 초기값은 -1

  * push -> top 1을 증가시킨 후 top 위치에 자료 삽입.

  * pop -> top 위치의 자료를 추출하고 top을 1 감소.

  * isEmpty -> top 의 값이 -1이면 true

  * isFull -> top 의 값이 스택 최대 크기보다 1 적은 값이면 true.

  ```java
  int stack[] = new int[100]; // 크기 100의 스택 생성
  int top = -1;
  
  stack[++top] = 5; // push 5
  stack[++top] = 9; // push 9
  stack[++top] = 1; // push 1
  
  for (int i = 0; i <= top; i++) 
    System.out.print(stack[i]+" "); // 스택 출력
  
  System.out.println();
  System.out.println(stack[top--]); // pop
  
  for (int i = 0; i <= top; i++) 
    System.out.print(stack[i]+" "); // 스택 출력
  ```
<br>

* 배열 기반 스택 구현

  * 고정 크기 스택.

  * 포화 및 공백 스택 검사 부재.

  ```java
  public class SimpleStack {
    int stack[];
    int top = -1;
    public SimpleStack(int size) {
      stack = new int[size];
    }
    public void push(int data) {
      stack[++top] = data;
    }
    public int pop() {
      return stack[top--];
    }
    @Override
    public String toString() {
      return "top="+top+", stack="+Arrays.toString(stack);
    }
  }
  ```
  ```java
  SimpleStack stack = new SimpleStack(10);
  
  stack.push(5);
  stack.push(9);
  stack.push(1);

  System.out.println(stack);
  int data = stack.pop();
  System.out.println("Data deleted from stack:"+data);

  System.out.println(stack);
  ```
<br>

* 동적 배열(dynamic array) 기반 스택 클래스 구현.

  * 포화 스택 -> 배열 2배 확장.

  * 삽입 연산의 시간복잡도 O(n)

  * 배열 축소 코드 추가 필요.

    * 1/4 포화시 1/2 크기로 축소.

  ```java
  public class SimpleStack {
    int DefaultSize=1, MaxSize;
    int stack[];
    int top=-1;

    public SimpleStack() {
      stack=new int[DefaultSize];
      MaxSize=DefaultSize;
    }

    private boolean empty() { return top==-1; }
    private boolean full() { return top==MaxSize-1; }

    public void push(int data) {
      if(full()){
        MaxSize*=2;
        stack=Arrays.copyOf(stack, MaxSize);
      }
      stack[++top]=data;
    }

    public int pop() {
      if(empty()) throw new RuntimeException("stack empty");
        return stack[top--];
    }

    @Override
    public String toString() {
      return "top="+top+", stack="+Arrays.toString(stack);
    }
  }
  ```
  ```java
  SimpleStack stack=new SimpleStack();
  
  for (int i = 0; i < 10; i++){
    stack.push(i);
    System.out.println(stack);
  }

  for (int i = 0; i < 10; i++){
    int data=stack.pop();
    System.out.println("Data from stack:"+data);
    System.out.println(stack);
  }
  ``` 
