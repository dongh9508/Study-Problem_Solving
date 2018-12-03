package problem_solving.week6;

public class t_1 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));
    }
    private static double fact(int n) {
        double v=1;
        for (int i = 2; i <= n; i++)
            v *= i;
        return v;
    }
}
