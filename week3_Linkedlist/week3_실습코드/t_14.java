package problem_solving.week3;

class t14list {
    Node head;
    // 단일 연결리스트에서 구현된 removeLast는 단순히 맨 뒤의 주소만 끊게 만든다.
    // head 필드만으로 이용.
    public void addLast(int i) {
        Node newNode=new Node(i);

        if(head!=null){
            Node p=head;
            while(p.next!=null) p=p.next;
            p.next=newNode;
        }

        else
            head = newNode;
    }
    public void removeLast() {
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

public class t_14 {
    public static void main(String[] args) {
        t14list list=new t14list();
        for (int i = 0; i < 5; i++) list.addLast(i);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
