import java.util.Scanner;

/**
 * Created by fan on 2017/7/16.
 */
public class Nyoj10 {
    static int n, m;
    static int cnt[][];
    static int [][]mp;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int step;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {
            n = cin.nextInt(); m = cin.nextInt();
            mp = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    mp[i][j] = cin.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    cnt[i][j] = 0;
                }
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    max = Math.max(max, dfs(i, j));
                }
            }
            System.out.println(max);
        }
        cin.close();
    }

    private static int dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m)
            return 0;
        if (cnt[x][y] != 0) return cnt[x][y];
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                //if ()
            }
        }
        return 0;
    }
}
