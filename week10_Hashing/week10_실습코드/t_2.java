package problem_solving.week10;

import java.util.LinkedList;

public class t_2 {
    public static void main(String[] args) {
        SimpleChainHashTable ht=new SimpleChainHashTable(1000);
        ht.put("Korea");
        ht.put("Japan");
        System.out.println(ht.get("Korea"));
        System.out.println(ht.get("Japan"));
        System.out.println(ht.get("China"));
    }
}

// Reference: http://opendatastructures.org/versions/edition-0.1e/ods-java/5_1_ChainedHashTable_Hashin.html, CCBY-2.5-CA
// Reference: https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/SeparateChainingHashST.java.html, GPLv3

