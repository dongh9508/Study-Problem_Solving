package problem_solving.week8._10;

import java.util.*;

public class t_1 {
    public static void main(String[] args) {
        int v[]={4, 2, 9, 5, 7, 5, 8, 10, 15};
        SimpleHeap heap = new SimpleHeap();
        for (int i = 0; i < v.length; i++) {
            heap.add(v[i]);
            System.out.println(heap);
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(heap.remove()+"=>"+heap);
        }
    }
}
class SimpleHeap {
    int last=-1, MaxHeapSize=4;
    int heap[]=new int[MaxHeapSize];
    private void resize() {
        MaxHeapSize*=2;
        heap=Arrays.copyOf(heap, MaxHeapSize);
    }
    private void swap(int m, int n) {
        int temp=heap[m];
        heap[m]=heap[n];
        heap[n]=temp;
    }
    public void add(Integer data) {
        if(last+1==MaxHeapSize) resize();
        heap[++last]=data; // heap의 마지막 노드 다음 위치에 새 자료 삽입
        for (int child=last; child>0; ) { // 마지막 노드를 heapify-up
            int parent=(child-1)/2;
            if(heap[child]<=heap[parent]) break; // 최대힙조건 검사
            swap(child, parent); // 조건 불만족 시 교환
            child=parent;
        }
    }
    public int remove() {
        if(last<0) throw new RuntimeException("heap empty");
        int data=heap[0]; // root 노드 자료 추출
        heap[0]=heap[last--]; // 마지막 노드 root로 이동 & 크기 1 감소
        for (int parent=0, child=2*parent+1; child<=last; parent=child, child=2*parent+1) { // root를 heapify-down
            if(child<last && heap[child]<heap[child+1]) child++;
            if(heap[child]<=heap[parent]) break;
            swap(child,parent);
        }
        return data;
    }
    @Override
    public String toString() {
        return Arrays.toString(heap);
    }
}
