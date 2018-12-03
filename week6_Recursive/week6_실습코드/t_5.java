package problem_solving.week6;

// 점화식
// n=0: power(m,n)=1
// n>0 AND n이 짝수: power(m,n)=power(m*m,n/2)
// n>0 AND n이 홀수: power(m,n)=power(m*m,n/2)*m
public class t_5 {
    public static void main(String[] argc) {
        System.out.println(power(2,60));
    }
    private static long power(long m, long n) {
        if(n==0) return 1;
        return power(m*m,n/2)*(n%2==0? 1:m);
    }
}
