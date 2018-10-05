package problem_solving.week4;

import java.util.*;

class SimpleStack2 {
    int DefaultSize=1;
    int MaxSize;
    int stack[];
    int top=-1;

    public SimpleStack2() {
        stack=new int[DefaultSize];
        MaxSize=DefaultSize;
    }

    public void push(int data) {
        if(full()){
            MaxSize*=2;
            stack=Arrays.copyOf(stack, MaxSize);
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

    public int peek() {
        if(empty()) return -1;
        return stack[top];
    }

    private boolean empty() {
        return top==-1;
    }
}
public class t_16 {
    public static void main(String[] args) {
        SimpleStack2 stack=new SimpleStack2();

        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack); // 스택 출력
            System.out.println("top : " + stack.peek());
        }

        for (int i = 0; i <10; i++){
            int data=stack.pop(); // 스택에서 자료 추출
            System.out.println("Data deleted from stack:"+data);
            System.out.println("top : " + stack.peek()); // peek()로 top 추출.
            System.out.println(stack); // 스택 출력
        }
    }
}
