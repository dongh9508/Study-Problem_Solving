Week 3 - Problem Solving(문제해결기법) 3주차.
===
* 연결리스트: 개념도 도식. 

  ![k-113](https://user-images.githubusercontent.com/33312179/45664799-cc094880-bb48-11e8-861e-d10b2f5cfa54.jpg)
<br>

* 연결리스트: 생성.

  ```java
  public class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data=data;
    }
  }
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      Node head=null;
      Node n1=new Node(1);
      Node n2=new Node(2);
      Node n3=new Node(3);
      head=n1;
      n1.next=n2;
      n2.next=n3;
    }
  }
  ```
  ```java
  public class Test {
    public static void main(String[] args) {
      Node head=null;
      head=new Node(1);
      head.next=new Node(2);
      head.next.next=new Node(3);
    }
  }
  ```
<br>

* 연결리스트: 출력.
  
  ```java  
  public class Test {
    public static void main(String[] args) {
      Node head=null;
      head=new Node(1);
      head.next=new Node(2);
      head.next.next=new Node(3);
      for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
    }
  }
  ```
<br>

* 연결리스트: 첫 위지 자료 삽입.

  ```java
  Node newNode=new Node(7);
  newNode.next=head;
  head=newNode; 
  ```
<br>

* 연결리스트: 끝 위지 자료 삽입.
  * Head 링크만 존재하는 경우 비효율적: O(n)
    * 연결리스트의 시작 노드부터 다음 노드로의 link를 따라 마지막 노드까지 이동해야 함.
  * Tail 링크가 유지되는 경우: O(1)  
  <br>

  ```java
  Node newNode=new Node(7);
  if(head!=null){
    Node p=head;
    while(p.next!=null) 
      p=p.next;
    p.next=newNode;
  }
  else head=newNode;
  ```
<br>

* 연결리스트: 임의 위치 위지 자료 삽입.

  ```java
  int searchValue=3;
  Node newNode=new Node(7);
  Node p=head, prev=null;
  while(p!=null && p.data!=searchValue) { 
    prev=p; 
    p=p.next; 
  }
  if(p==null) 
    System.out.println(searchValue+" does not exist");
  else{
    if(prev!=null) prev.next=newNode;
    else head=newNode;
    newNode.next=p;
  }
  ```
<br>

* 연결리스트: 첫 위치 자료 삭제.

  ```java
  if(head!=null) head=head.next;
  ```
<br>

* 연결리스트: 끝 위치 자료 삭제.

  ```java
  if(head!=null){
    Node p=head, prev=null;
    while(p.next!=null) { 
      prev=p; 
      p=p.next; 
    }
    if(prev!=null) 
      prev.next=null;
    else 
      head=null;
  }
  ```
<br>

* 연결리스트: 임의 위치 자료 삭제.

  ```java
  int searchValue=2;
  Node p=head, prev=null;
  while(p!=null && p.data!=searchValue) { 
    prev=p; 
    p=p.next; 
  }
  if(p==null) 
    System.out.println(searchValue+" does not exist");
  else{
    if(prev!=null) 
      prev.next=p.next;
    else 
      head=p.next;
  }
  ```
