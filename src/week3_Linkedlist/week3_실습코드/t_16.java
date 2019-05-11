package problem_solving.week3;

class DoubleList {
    Node head;
    Node tail;
    public void addFirst(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode=new Node(data);
        if(head!=null){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        else {
            head = newNode;
            tail = newNode;
        }
    }
    public void removeLast() {
        if(tail!=null){
            tail = tail.prev;
            tail.next = null;
        }

    }

    public void removeFirst() {
        if(head != null) {
            head = head.next;
            head.prev = null;
        }

    }
    @Override
    public String toString() {
        String v = "";
        for (Node p = head; p != null; p = p.next) {
            if (v.length() > 0)
                v += "->";
            v += p.data;
        }
        return v;
    }
}


public class t_16 {
    public static void main(String[] args) {
        DoubleList list=new DoubleList();
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
