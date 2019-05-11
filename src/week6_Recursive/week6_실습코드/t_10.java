package problem_solving.week6;

public class t_10 {
    public static void main(String[] args) {
        String s="South, Korea 안녕";
        char v[]=s.toCharArray();
        toUpper(v, 0);
        System.out.println(v);
    }
    private static void toUpper(char[] v, int i) {
        if(i == v.length-1) {
            return;
        }
        else {
            if(v[i] >= 'A' && v[i] <= 'Z') {
                v[i] += 'a'- 'A';
            }
            toUpper(v, i+1);
        }
    }
}
