package problem_solving.week5;

import java.util.*;

class SimpleQueue {
    int rear=-1, front=-1, MaxSize=5, newMaxSize;
    char queue[];
    public SimpleQueue() {
        queue=new char[MaxSize];
        newMaxSize = MaxSize;
    }
    public void add(char data) {
        if(full()) {
            newMaxSize*=2;
            queue=Arrays.copyOf(queue, newMaxSize);
        }
        queue[++rear]=data;
    }
    public int remove() {
        if(empty()) throw new RuntimeException("queue empty");
        return queue[++front];
    }
    private boolean full() { return rear==MaxSize-1; }
    private boolean empty() { return rear==front; }
    @Override
    public String toString() {
        return "front="+front+", rear="+rear+", "+Arrays.toString(queue);
    }
}

public class t_10 {
    public static void main(String[] args) {
        SimpleQueue queue=new SimpleQueue();
        System.out.println("크기 1 큐 초기 상태: "+queue);
        queue.add('A'); System.out.println("자료 A 삽입 후: "+queue);
        queue.add('B'); System.out.println("자료 B 삽입 후: "+queue);
        queue.add('C'); System.out.println("자료 C 삽입 후: "+queue);
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        System.out.println("큐에서 자료 추출: "+(char)queue.remove());
        queue.add('D'); System.out.println("자료 D 삽입 후: "+queue);
        queue.add('E'); System.out.println("자료 E 삽입 후: "+queue);
        queue.add('F'); System.out.println("자료 F 삽입 후: "+queue);
        queue.add('G'); System.out.println("자료 G 삽입 후: "+queue);
    }
}
