package problem_solving.week5;

import java.util.*;

public class t_7 {
    public static void main(String[] args) {
        class Point {
            int x,y;
            public Point(int x, int y) { this.x=x; this.y=y; }
        }
        int R=6, C=8;
        String input=
                        "0000000#"+
                        "##0#0#0#"+
                        "0000000#"+
                        "0#####0#"+
                        "00000###"+
                        "###00000";
        String maze[][] = new String[R][C];
        int visited[][] = new int[R][C];

        for (int i = 0; i < input.length(); i++) {
            maze[i / C][i % C] = String.valueOf(input.charAt(i));
            visited[i / C][i % C] = 0;
        }

        LinkedList<Point> queue = new LinkedList<>();

        maze[0][0] = "v"; // visited
        visited[0][0] = 1;
        queue.addLast(new Point(0,0));

        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};

        while(!queue.isEmpty()){
            Point p = queue.removeFirst();
            for (int i = 0; i < dx.length; i++) {
                int x = p.x+dx[i];
                int y = p.y+dy[i];
                if(x < 0 || x >= R || y < 0 || y >= C || maze[x][y].equals("#") || maze[x][y].equals("v"))
                    continue;
                maze[x][y] = "v";
                visited[x][y] = visited[p.x][p.y] + 1;
                queue.addLast(new Point(x,y));
            }
        }

        queue.clear();

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++)
                System.out.printf("%02d ", visited[i][j]);
            System.out.println();
        }

    }

}
