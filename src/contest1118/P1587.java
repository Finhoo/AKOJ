package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1587 {
    static int n, m, x, y, ans;
    static int []dx = {-1, 0, 1, 0};
    static int []dy = {0, -1, 0, 1};
    static int [][]map;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            x = cin.nextInt();
            y = cin.nextInt();
            map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = cin.nextInt();
                }
            }
            ans = 0;
            dfs(x-1, y-1);
            System.out.println(ans);
        }
        cin.close();
    }

    private static void dfs(int x, int y) {
        if (map[x][y] != 0)
            ans++;
        map[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx >= 0 && nx < n & ny >= 0 && ny < m && map[nx][ny] != 0)
                dfs(nx, ny);
        }
    }
}
