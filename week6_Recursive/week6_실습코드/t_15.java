package problem_solving.week6;

public class t_15 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        if(n<2) return n;
        return fibo(n-2)+fibo(n-1);
    }
}
