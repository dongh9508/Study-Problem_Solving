package problem_solving.week6;

public class t_11 {
    public static void main(String[] args) {
        String s="South, Korea";
        char v[]=s.toCharArray();
        System.out.println(countUpper(v, 0));
    }
    private static int countUpper(char[] v, int i) {
       int count = 0;
       if(i == v.length-1) {
           if (v[i] >= 'A' && v[i] <= 'Z') {
               count++;
           }
           return count;
       }
       else {
           if (v[i] >= 'A' && v[i] <= 'Z') {
               count++;
           }
           return count + countUpper(v, i + 1);
       }
    }
}
