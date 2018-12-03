package problem_solving.week6;

public class t_23 {
    static int sum=21; // 부분집합 내 정수들의 합이 되어야 할 값
    static int n[]={1,3,4,5,8,9}; // 입력: n개 정수
    public static void main(String[] args) {
        int subset[]=new int[n.length];
        subsetSum(subset, 0);
    }
    private static void subsetSum(int[] subset, int i) {
        if(i==n.length){
            Integer arr[]=new Integer[n.length];
            int result = 0;
            for(int j=0; j<n.length; j++) {
                if(subset[j] == 1) {
                    result += n[j];
                    arr[j] = n[j];
                }
            }
            if(result == sum) {
                for(int k=0; k<arr.length; k++) {
                    if(arr[k] != null)
                        System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            return;
        }
        subset[i]=0;
        subsetSum(subset, i+1);
        subset[i]=1;
        subsetSum(subset, i+1);
    }
}
