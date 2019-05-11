package problem_solving.week6;

// 점화식
// n=0 : fact(n)=1
// n>=1: fact(n)=n*fact(n-1)

public class t_2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
    private static double fact(int n) {
        if(n==0) return 1;
        return n*fact(n-1);
    }
}
