package problem_solving.week6;

public class t_27 {
    public static void main(String[] args) {
        int N=5, K=3;
        int v[]=new int[N];
        genCombinations(N, K, 0, v, 0);
    }
    private static void genCombinations(int N, int K, int startIndex, int v[], int len) {
        if(len==K) {
            String s="";
            for (int i = 0; i < v.length; i++)
                s+=v[i];
            System.out.println(s);
            return;
        }
        for (int i = startIndex; i < N; i++) {
            v[i]=2;
            genCombinations(N-1, K-1, i+1, v, len+1);
            v[i]=0;

            v[i]=1;
            genCombinations(N, K, i+1, v, len+1);
            v[i]=0;
        }
    }
}
