package problem_solving.week6;

// 점화식
// i = 0, max(n,i) = n[0];
// i > 0 AND n[i] > max(n, i-1), max(n, i) = n[i]
// i > 0 AND n[i[ < max(n, i-1), max[n, i) = max(n, i-1)
public class t_8 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(max(n, n.length-1));
    }
    private static int max(int[] n, int i) {
        if(i == 0) return n[i];
        return n[i] > max(n, i-1) ? n[i] : max(n, i-1);
    }
}
