package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1594 {
    static int R, C;
    final static int []dx = {-1, 0, 1, 0};
    final static int []dy = {0, -1, 0, 1};
    static char [][]map;
    static int tempSheep, tempWolf, sheep, wolf;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        R = cin.nextInt(); C = cin.nextInt();
        map = new char[R+3][C+3];
        for (int i = 0; i < C+2; i++) {
            map[0][i] = map[R+1][i] = '.';
        }
        for (int i = 1; i <= R; i++) {
            map[i] = ('.' + cin.next() + '.').toCharArray();
        }
        dfs(0, 0);
        tempSheep = sheep = 0; tempWolf = wolf = 0;
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if (map[i][j] != '#') {
                    dfs(i, j);
                    if (tempSheep > tempWolf) {
                        sheep += tempSheep;
                    }else {
                        wolf += tempWolf;
                    }
                    tempWolf = tempSheep = 0;
                }
            }
        }
        System.out.println(sheep+" "+wolf);
        cin.close();
    }

    private static void dfs(int i, int j) {
        if (map[i][j] == 'o') tempSheep++;
        if (map[i][j] == 'v') tempWolf++;
        map[i][j] = '#';

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if (nx >= 0 && nx < R+2 && ny >= 0 && ny < C+2 && map[nx][ny] != '#')
                dfs(nx, ny);
        }
    }
}
