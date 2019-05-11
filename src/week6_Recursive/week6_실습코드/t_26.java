package problem_solving.week6;

public class t_26 {
//    static int sum=21;
//    public static void main(String[] args) {
//        int n[]={1,3,4,5,8,9};
//        System.out.println(subsetSum(n, 0, 0));
//    }
//    private static boolean subsetSum(int[] n, int i, int partialSum) {
//        if(i==n.length) return partialSum==sum;
//        return subsetSum(n, i+1, partialSum) || subsetSum(n, i+1, partialSum+n[i]);
//    }
    static int sum=21;
    public static void main(String[] args) {
        int n[]={1,3,4,5,8,9};
        System.out.println(subsetSum(n, 0, sum));
    }
    private static boolean subsetSum(int[] n, int i, int partialSum) {
        if(i==n.length) return partialSum==0;
        return subsetSum(n, i+1, partialSum) || subsetSum(n, i+1, partialSum-n[i]);
    }
}
