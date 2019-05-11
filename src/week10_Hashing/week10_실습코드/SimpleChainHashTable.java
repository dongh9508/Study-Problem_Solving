package problem_solving.week10;

import java.util.LinkedList;

public class SimpleChainHashTable {
    private int HashTableSize;
    LinkedList<Object> hashTable[];
    int count;
    public SimpleChainHashTable(int size) {
        HashTableSize=size;
        count = 0;
        hashTable=new LinkedList[HashTableSize];
        for (int i = 0; i < hashTable.length; i++) hashTable[i]=new LinkedList<>();
    }
    public boolean put(Object key) {
        if(get(key)!=null) return false;
        if(count == HashTableSize) resize();
        hashTable[hash(key)].add(key);
        count++;
        return true;
    }
    private void resize() {
        HashTableSize *= 2;
        LinkedList<Object> newTable[] = new LinkedList[HashTableSize];
        for(int i=0; i<newTable.length; i++) {
            newTable[i] = new LinkedList<>();
        }
        for(int i=0; i < hashTable.length; i++) {
            for(Object key : hashTable[i]) {
                newTable[hash(key)].add(key);
            }
        }
        hashTable = newTable;
    }
    private int hash(Object key) {
        return (key.hashCode()&0x7FFFFFFF)%HashTableSize;
    }
    public Object get(Object key) {
        for (Object v : hashTable[hash(key)]) if(v.equals(key)) return v;
        return null;
    }
    public void print() {
        for(int i=0; i <hashTable.length; i++)
            System.out.println("hashTable[" + i + "]=>" + hashTable[i]);
    }
}
