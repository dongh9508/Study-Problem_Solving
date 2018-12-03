package problem_solving.week6;

public class t_17 {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    private static long fibo(int n) {
        long[] result = new long[n+1];
        result[0] = 0;
        result[1] = 1;
        for(int i=0; i<n-1; i++) {
            result[i+2] = result[i+1] + result[i];
        }
        return result[n];
    }
}
