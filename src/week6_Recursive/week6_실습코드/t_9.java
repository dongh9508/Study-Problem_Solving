package problem_solving.week6;

public class t_9 {
    public static void main(String[] args) {
        int n[]={5,1,8,3,2};
        System.out.println(sum(n, 0, n.length-1));
    }
    private static long sum(int[] n, int low, int high) {
        if(low == high) {
            return n[low];
        }
        else {
               long left_max = sum(n, low, (high + low) / 2);
               long right_max = sum(n, (high+low) / 2+1, high);

               return left_max > right_max ? left_max : right_max;
        }
    }
}
