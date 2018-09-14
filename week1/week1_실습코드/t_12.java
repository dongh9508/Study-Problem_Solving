package problem_solving.chap1;

public class t_12 {
    public static void main(String[] args) {
        int n[]={77,88,99};
        String v="";
        for (int i = 0; i < n.length; i++) {
            if(i != n.length-1)
                v += n[i] + ", ";
            else
                v += n[i];
        }
        System.out.println("["+v+"]");
    }
}
