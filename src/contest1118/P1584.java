package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1584 {
    static char [][]map;
    static int [][]vis;
    static int []dx = {-1, 0, 1, 0};
    static int []dy = {0, -1, 0 ,1};
    static int n, m, max;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt(); m = cin.nextInt();
        int x = cin.nextInt(), y = cin.nextInt();
        map = new char[n][m];
        vis = new int[n][m];
        for (int i=0; i<n; i++) {
            map[i] = cin.next().toCharArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vis[i][j] = 0;
            }
        }
        max = 0;
        dfs(x, y);
        System.out.println(max);
        cin.close();
    }

    private static void dfs(int x, int y) {
        vis[x][y] = 1;
        if (map[x][y] == '.') {
            int ans = f(x, y);
            max = max < ans ? ans : max;
        }
        for (int i=0; i<4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if (nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny]=='.' && vis[nx][ny] == 0)
                dfs(nx, ny);
        }
    }

    private static int f(int x, int y) {
        int res = 0;
        int i = x+1, j = y;
        while (i < n && map[i][j] != '#') if (map[i++][j] == 'G') res++;
        i = x-1; j = y;
        while (i >= 0 && map[i][j] != '#') if (map[i--][j] == 'G') res++;
        i = x; j = y+1;
        while (j < m && map[i][j] != '#') if (map[i][j++] == 'G') res++;
        i = x; j = y-1;
        while (j >= 0 && map[i][j] != '#') if (map[i][j--] == 'G') res++;
        return res;
    }
}
