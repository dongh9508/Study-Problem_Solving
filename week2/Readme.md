Week 2 - Problem Solving(문제해결기법) 2주차.
===
* 자바 배열(array).
  * 연속된(contiguous) 메모리 공간 차지, 인덱스(index)로 위치 식별
  <br>
  ```java
    int n[] = new int[100];
    n[0]=5;
    n[1]=8;
    n[2]=4;
  ```
<br><br>
* 배열 내 임의 위치 자료 접근 시간 : O(1)
  * 인덱스 0 위치 자료 접근 시간: 8000+0*4 -> 덧셈 1회, 곱셈 1회
  * 인덱스 1 위치 자료 접근 시간: 8000+1*4 -> 덧셈 1회, 곱셈 1회
  * 인덱스 2 위치 자료 접근 시간: 8000+2*4 -> 덧셈 1회, 곱셈 1회
  * …
  * 인덱스 n-1 위치 자료 접근 시간: 8000+(n-1)*4 -> 덧셈 1회, 곱셈 1회
  * 배열 내 자료 위치에 무관하게 항상 일정한 시간 소요
<br><br>
* 배열 첫 위치 자료 삽입: O(n)

  ```java
    int n[] = new int[10];
    for (int i = 0; i < 5; i++) 
      n[i] = i + 1;
  ```    
<br><br>
* 연결리스트(linked list)
  * 연결리스트 내 임의 위치 상수 시간 접근 불가.
  * k번째 자료 접근 위해 head부터 k번 다음 자료 위치로 이동 필요.
  <br>
  ```java  
  LinkedList<Integer> list = new LinkedList<>();
  list.add(5);
  list.add(8);
  list.add(4);
  ```
<br><br>
* 연결리스트 내 임의 위치 자료 접근 시간: O(n)
  * ![3](https://user-images.githubusercontent.com/33312179/45533535-f8fce900-b832-11e8-9dbe-922ab613ce4e.jpg)  위치 자료 접근 시간 : 1
  * ![4](https://user-images.githubusercontent.com/33312179/45533561-0f0aa980-b833-11e8-98af-657255fc3f63.jpg)  위치 자료 접근 시간 : 2
  * ![5](https://user-images.githubusercontent.com/33312179/45533568-192ca800-b833-11e8-9aad-c67fa52de483.jpg)  위치 자료 접근 시간 : 3
  * …
  * 마지막 n번째 위치 자료 접근 시간: n
  * 최악의 경우 n번 이동 필요: O(n)
  * 배열 내 자료 위치에 무관하게 항상 일정한 시간 소요<br><br>
<br><br>
* 연결리스트 첫 위지 자료 삽입 : O(1)
  ```java
  LinkedList<Integer> list=new LinkedList<>();
  list.add(1);
  list.add(2);
  list.add(3);
  list.addFirst(7); 
  ```

