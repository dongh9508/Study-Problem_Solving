package problem_solving.week6;

import java.util.*;

public class t_15_1 {
    static int wcount = 0;
    public static void main(String[] args) {
        int R=5, C=5, count=0;
        char ground[][] = new char[R][C];
        Random random = new Random();

        for (int i = 0; i < ground.length; i++){ // 임의 개수의 물웅덩이 포함 평면 생성
            for (int j = 0; j < ground[i].length; j++)
                ground[i][j] = (random.nextInt(3)==0) ? '1' : '0';
        }

        for (int i = 0; i < ground.length; i++){ // 평면 출력
            for (int j = 0; j < ground[i].length; j++)
                System.out.print(ground[i][j]);
            System.out.println();
        }

        String watercount = "";

        System.out.println();
        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground[i].length; j++){
                wcount = 0;
                if(ground[i][j]=='1') {
                    dfs(ground, R, C, i, j);
                    count++;
                    watercount += wcount + ", ";
                }
            }
        }

        watercount = watercount.substring(0, watercount.length()-2);
        System.out.println(count);
        System.out.println("물 웅덩이 크기 : " + watercount);
    }
    private static void dfs(char[][] ground, int R, int C, int i, int j) {
        int dx[] = {0, 0, 1, -1, -1, 1, -1, 1};
        int dy[] = {1, -1, 0, 0, 1, 1, -1, -1};
        ground[i][j] = '0';
        wcount++;
        for (int k = 0; k < dx.length; k++) {
            int x = i+dx[k];
            int y = j+dy[k];
            if(x < 0 || x >= R || y < 0 || y >= C || ground[x][y] == '0')
                continue;
            dfs(ground, R, C, x, y);
        }
    }
}
