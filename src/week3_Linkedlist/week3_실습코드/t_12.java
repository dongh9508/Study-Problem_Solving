package problem_solving.week3;

class t12List {
    Node head;

    public void addFirst(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public int size() {
        int a = 0;
        Node p=head;

        while(p!=null) {
            a += 1;
            p=p.next;
        }

        return a;
    }

    public String get(int i) {
        int searchindex = i;
        Node p = head;
        for(int j=0; j<searchindex; j++ ) {
            if (p != null) {
                p = p.next;
            }
        }
        return String.valueOf(p.data);
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

public class t_12 {
    public static void main(String[] args) {
        t12List list=new t12List();
        for (int i = 0; i < 5; i++) list.addFirst(i);
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i)+" ");
    }
}
