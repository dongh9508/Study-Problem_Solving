package problem_solving.week10;

public class t_3 {
    public static void main(String[] args) {
        //String keys[]={"a", "a", "a", "a"};
        String keys[]={"a", "b", "c", "d", "a", "a", "e", "c", "d", "a"};
        SimpleChainHashTable ht=new SimpleChainHashTable(1);
        for (int i = 0; i < keys.length; i++) ht.put(keys[i]);
        ht.print();
    }
}
