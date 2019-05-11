package problem_solving.week6;

// 점화식
// n=0: power(m,n)=1
// n>0: power(m,n)=m*power(m,n-1)
public class t_4 {
    public static void main(String[] args) {
        int m=2, n=60;
        System.out.println(power(m,n));
    }
    private static long power(long m, long n) {
        if(n==0) return 1;
        return m*power(m,n-1);
    }
}
