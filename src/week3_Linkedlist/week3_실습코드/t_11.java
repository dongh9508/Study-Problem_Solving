package problem_solving.week3;

class t11List {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void removeFirst() {
        head = head.next;
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

public class t_11 {
    public static void main(String[] args) {
        t11List list=new t11List();
        for (int i=1; i <=5; i++) list.addFirst(i);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
