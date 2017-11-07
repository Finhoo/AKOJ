package contest1118;

import com.sun.media.sound.SoftTuning;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1589 {
    static int n, m, top = 0;
    static boolean flag = false;
    static boolean [][]vis;
    static int [][]map;
    static Node []node;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            map = new int[n][m];
            vis = new boolean[n][m];
            node = new Node[n*m];
            vis = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = cin.nextInt();
                }
            }

            dfs(0, 0, 1);
            if(!flag)
                System.out.println("impossible\n");
            else
                System.out.println();
        }
        cin.close();
    }

    private static void dfs(int x, int y, int front) {
        if (x == n-1 && y ==m) {
            flag = true;
            for (int i = 0; i < top; i++) {
                System.out.print(String.format("(%d,%d) ", node[i].x+1, node[i].y+1));
            }
            return;
        }

        if (x >= n || x < 0 || y >= m || y < 0)
            return;

        if (vis[x][y]) return;

        vis[x][y] = true;
        node[top++] = new Node(x, y);

        if (map[x][y] >= 5 && map[x][y] <= 6) {
            if (front == 1)
                dfs(x, y+1, 1);
            else if (front == 2)
                dfs(x+1, y, 2);
            else if (front == 3)
                dfs(x, y-1, 3);
            else if (front == 4)
                dfs(x-1, y, 4);
        }

        if (map[x][y] >= 1 && map[x][y] <= 4) {
            if (front == 1) {
                dfs(x-1, y, 4);
                dfs(x+1, y, 2);
            }
            else if (front == 2) {
                dfs(x, y+1, 1);
                dfs(x, y-1, 3);
            }
            else if (front == 3) {
                dfs(x-1, y, 4);
                dfs(x+1, y, 2);
            }
            else if (front == 4) {
                dfs(x, y-1, 3);
                dfs(x, y+1, 1);
            }
        }
        vis[x][y] = false;
        top--;
        return;
    }
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
