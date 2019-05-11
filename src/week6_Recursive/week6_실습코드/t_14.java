package problem_solving.week6;

public class t_14 {
    public static void main(String[] args) {
        System.out.println(gcd(64,48));
    }
//    private static int gcd(int a, int b) {
//        if(b == 0) return a;
//        return gcd(b, a%b);
//    }
    private static int gcd(int a, int b) {
        int result = 0;
        while (a%b != 0) {
            result = a%b;
            a = b;
            b = result;
            if(a%b == 0) {
                result = b;
                break;
            }
        }
        return result;
    }
}
