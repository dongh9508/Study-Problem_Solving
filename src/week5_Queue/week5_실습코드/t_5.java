package problem_solving.week5;

public class t_5 {
    public static void main(String[] args) {
        int R=5, C=6;
        String s="012345678901234567890123456789";
        char maze[][]=new char[R][C];
        int k = 0;
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = s.charAt(k);
                System.out.print(maze[i][j]);
                k++;
            }
            System.out.println();
        }
    }
}
