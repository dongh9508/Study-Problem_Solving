package problem_solving.week3;

class t13list {
    Node head;

    /* // head 필드만으로 이용.
    public void addLast(int i) {
        Node newNode=new Node(i);

        if(head!=null){
            Node p=head;
            while(p.next!=null) p=p.next;
            p.next=newNode;
        }

        else
            head = newNode;
    }*/
    public void addLast(int i) {
        Node newNode=new Node(i);

        if(head!=null){
            Node p=head;
            Node tail = null;
            while(p.next!=null) p=p.next;
            tail = p;
            tail.next = newNode;
        }

        else
            head = newNode;
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

public class t_13 {
    public static void main(String[] args) {
        t13list list = new t13list();
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        System.out.println(list);
    }
}
