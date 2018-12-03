package problem_solving.week6;

// 점화식
// i=n-1 : sum(n,i)=n[n-1]
// i != n-1 : sum(n,i)=n[i]+sum(n,i+1)
public class t_7 {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        System.out.println(sum(n, 0));
    }
    private static int sum(int[] n, int i) {
        if(i == n.length-1) return n[n.length-1];
        return n[i] + sum(n, i+1);
    }
}
