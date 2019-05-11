package problem_solving.week9;

public class t_1 {
    public static void main(String[] args) {
        int V=8;
        String input="0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7";
        int adjMat[][]=new int[V][V];
        String s[]=input.split("\\s+");
        for (int i = 0; i < s.length; i+=2){
            int v1=Integer.parseInt(s[i]);
            int v2=Integer.parseInt(s[i+1]);
            adjMat[v1][v2]=1;
            adjMat[v2][v1]=1;
        }
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j]);
            }
            System.out.println();
        }
    }
}
