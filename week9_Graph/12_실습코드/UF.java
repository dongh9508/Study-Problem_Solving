package problem_solving.week9._12;

import java.util.Arrays;

public class UF {
    int parent[], rank[], count;
    public UF(int N) {
        count = N;
        parent=new int[N];
        rank=new int[N];
        for (int i = 0; i < parent.length; i++){
            parent[i]=i;
        }
    }
    public void union(int i, int j) { // union by rank
        i=find(i);
        j=find(j);
        if(i==j) return;
        if(rank[i]<rank[j]) parent[i]=j;
        else if(rank[i]>rank[j]) parent[j]=i;
        else{
            parent[i]=j;
            rank[j]++;
        }
        count--;
    }
    public int find(int i) { // path compression
        int root = i;
        while(root != parent[root]) root = parent[root];
        while(i != parent[i]) {
            int k = parent[i];
            parent[i] = root;
            i = k;
        }
        return root;
    }
//    public int find(int i) { // path compression
//        if(i!=parent[i]) parent[i]=find(parent[i]);
//        return parent[i];
//    }
    @Override
    public String toString() {
        return Arrays.toString(parent);
    }
}
