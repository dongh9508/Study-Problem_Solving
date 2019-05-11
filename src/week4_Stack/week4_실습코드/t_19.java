package problem_solving.week4;

import java.util.*;
// stock span problem
// 주식가격이 일 단위로 바뀐다고 할 때
// span은 현재 날짜보다 낮은 가격의 날이 얼마나 되었는지를 담고 있는 배열
public class t_19 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];

        stack.push(0);
        span[0] = 1;
        for(int i=1; i<span.length; i++) {

            while(!stack.isEmpty() && price[stack.peek()] < price[i]) {

                stack.pop();
            }
            if(stack.isEmpty())
                span[i] = i+1;
            else
                span[i] = i - stack.peek();
            stack.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
}
