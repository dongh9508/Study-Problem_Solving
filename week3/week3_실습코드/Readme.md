Week 3 - Problem Solving(문제해결기법) 3주차 실습 문제.
===

### 1. t_11.java
  > 아래 SimpleList의 removeFirst()는 연결리스트의 0번째 자료를 삭제하는 메소드이다. 아래 코드가 정상 실행되도록 removeFirst()를 완성하시오.

  ```
  - removeFirst 실행 전 연결리스트: 4->3->2->1->0
  - removeFirst 실행 후 연결리스트: 3->2->1->0
  ```
  ```java
  public class SimpleList {
    Node head;
    public void addFirst(int data) {
      Node newNode=new Node(data);
      newNode.next=head;
      head=newNode;
    }
    public void removeFirst() {
    }
    @Override
    public String toString() {
      String v = "";
      for (Node<T> p = head; p != null; p = p.next) {
        if (v.length() > 0)
          v += "->";
        v += p.data;
      }
      return v;
     } 
  }
  public class Test {
    public static void main(String[] args) {
      SimpleList list=new SimpleList();
      for (int i=1; i <=5; i++) list.addFirst(i);
      System.out.println(list);
      list.removeFirst();
      System.out.println(list);
    }
  }
  ```
<br>

### 2. t_12.java
  > 아래 SimpleList의 size()는 연결리스트에 저장된 자료의 전체 개수를 반환하는 메소드이다. 또한 SimpleList의 get(int index)는 연결리스트의 index번째 노드의 data 값을 반환하는 메소드이다. 아래 Test 클래스는 연결리스트 4->3->2->1->0를 생성한 후 get() 메소드를 통해 각 노드의 자료를 가져와 출력하는 코드이다. 아래 코드가 정상 동작하도록 SimpleList를 수정하시오.

  ```
  - 아래 코드 실행결과: 4 3 2 1 0
  ```
  ```java
  public class SimpleList {
    Node head;
    public void addFirst(int data) {
      Node newNode=new Node(data);
      newNode.next=head;
      head=newNode;
    }
    public int size() {

    }
    public String get(int i) {

    }
    @Override
    public String toString() { … } // 이전과 동일
  }
  public class Test {
    public static void main(String[] args) {
      SimpleList list=new SimpleList();
      for (int i = 0; i < 5; i++) list.addFirst(i);
      for (int i = 0; i < list.size(); i++) System.out.print(list.get(i)+" ");
    }
  }
  ```
<br>

### 3. t_13.java
  > 아래 코드가 연결리스트 1->2->3을 생성하도록 다음 두 가지 구현 방법 각각에 대해 아래 SimpleList를 수정하시오. addLast(int data)는 연결리스트의 끝 위치에 새로운 자료 data를 추가하는 메소드이다. 두 구현 방법의 시간 복잡도는 각각 어떻게 되는가?

  ```
  - 구현 방법 1: tail 필드를 추가하지 않고, head 필드만 사용하여 구현.
  - 구현 방법 2: tail 필드를 추가하고, tail 필드를 사용하여 구현.
  ```
  ```java
  public class SimpleList {
    Node head;
    public void addLast(int i) {
    
    }
    @Override
    public String toString() { … } // 이전과 동일
  }
  public class Test {
    public static void main(String[] args) {
      SimpleList list=new SimpleList();
      list.addLast(1);
      list.addLast(2);
      list.addLast(3);
      System.out.println(list);
    }
  }
  ```
<br>

### 4. t_14.java
  > SimpleList의 removeLast는 연결리스트의 끝 위치 자료를 삭제하는 메소드이다. 아래 코드가 정상 동작하도록 SimpleList에 removeLast를 구현하시오. 지금까지 구현한 SimpleList와 같은 단일연결리스트에서 구현된 removeLast는 어떤 단점이 있는가?

  ```java
  public class SimpleList {
    Node head;
    public void addLast(int i) {
    
    }
    public void removeLast() {
    
    }
    @Override
    public String toString() { … } // 이전과 동일
  }
  public class Test {
    public static void main(String[] args) {
      SimpleList list=new SimpleList();
      for (int i = 0; i < 5; i++) list.addLast(i);
      System.out.println(list);
      list.removeLast();
      System.out.println(list);
    }
  }
  ```
<br>

### 5. t_15.java
  > 다음은 이중연결리스트 head->77<->99<-tail을 생성하는 코드이다. next, prev 링크는 각각 순방향, 역방향 연결을 구성한다. 아래 코드를 입력하고 실행하면서 그 내용을 학습하시오.

  ```java
  public class Test {
    public static void main(String[] args) {
      class Node {
        int data;
        Node prev, next;
        public Node(int data) {
          this.data=data;
        }
      }
      Node n1=new Node(1);
      Node n2=new Node(2);
      Node head=n1;
      Node tail=n2;
      n1.next=n2;
      n2.prev=n1;
      System.out.print("head");
      for (Node p=head; p != null; p=p.next) System.out.print("->"+p.data);
      System.out.print("\ntail");
      for (Node p=tail; p != null; p=p.prev) System.out.print("->"+p.data);
    }
  }
  ```
<br>

### 6. t_16.java
  > 다음과 같이 동작하는 SimpleList를 이중연결리스트로 구현하시오.
  ```
  - 실행결과:
  2->1->9->8
  1->9
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      SimpleList list=new SimpleList();
      list.addFirst(1);
      list.addFirst(2);
      list.addLast(9);
      list.addLast(8);
      System.out.println(list);
      list.removeFirst();
      list.removeLast();
      System.out.println(list);
    }
  }
  ```



