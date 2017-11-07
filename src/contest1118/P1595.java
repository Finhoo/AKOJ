package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1595 {
    private static final int INF = Integer.MAX_VALUE;
    static int []du, t;
    static boolean []vis;
    static int ans, start;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            du = new int[n+1];
            t = new int[n+1];
            vis = new boolean[n+1];
            for (int i = 1; i <= n; i++) {
                t[i] = cin.nextInt();
                du[t[i]]++;
                vis[i] = false;
            }

            for (int i=1; i<=n; i++) {
                if (du[i] == 0 && !vis[i])
                    destory(i);
            }
            ans = INF;
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    start = i;
                    dfs(t[i], 1);
                }
            }
            System.out.println(ans);
        }
        cin.close();
    }

    private static void dfs(int pos, int step) {
        vis[pos] = true;
        if (pos == start) {
            ans = Math.min(ans, step);
            return;
        }
        dfs(t[pos], step+1);
    }

    private static void destory(int i) {
        vis[i] = true;
        du[t[i]]--;
        if (du[t[i]] == 0)
            destory(t[i]);
    }
}
