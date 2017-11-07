package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1592 {
    private static final int INF = 0xffffff;
    static int n, m;
    static int [][]map;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt(); m = cin.nextInt();
            int start = cin.nextInt(), end = cin.nextInt();
            map = new int[n+1][n+1];
            init();
            while (m-- > 0) {
                int x = cin.nextInt(), y = cin.nextInt();
                if (x != 0 && y != 0) {
                    map[x][y] = 1;
                    map[y][x] = 1;
                }
            }
            floyd();
            if (start == end) System.out.println(0);
            else if (map[start][end] == INF || start == 0 || end == 0) System.out.println("Connot reach");
            else System.out.println(map[start][end]);
        }
        cin.close();
    }

    private static void init() {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                map[i][j] = INF;
                if (i == j) map[i][j] = 0;
            }
        }
    }

    private static void floyd() {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (map[i][k] != INF && map[k][j] != INF)
                        map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
                }
            }
        }
    }
}
