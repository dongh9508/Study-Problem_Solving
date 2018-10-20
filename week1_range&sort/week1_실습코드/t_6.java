package problem_solving.chap1;

public class t_6 {
    public static void main(String[] args) {
        int n = 987654321;
        int k = 4;

        /*
        String s = String.valueOf(n);
        System.out.println(s.charAt(k-1));
        */

        System.out.println(n/(int)Math.pow(10, k-1)%10);
    }
}
