package contest1118;

import java.util.*;

/**
 * Created by fan on 2017/10/9.
 */
public class P1596 {
    static int n, m, k, ans;
    static int []father;
    static ArrayList<Edge> list;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            k = cin.nextInt();
            list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(new Edge(cin.nextInt(), cin.nextInt(), cin.nextInt()));
            }
            ans = 0;
            Collections.sort(list, new Comparator<Edge>() {
                @Override
                public int compare(Edge o1, Edge o2) {
                    return o1.w-o2.w;
                }
            });
            k = n - k;
            kruscal();

            if (k != 0) System.out.println("No Answer");
            else
                System.out.println(ans);
        }
        cin.close();
    }

    private static void kruscal() {
        father = new int[n+1];
        for (int i = 0; i <= n; i++) {
            father[i] = i;
        }

        for (Edge e: list) {
            int s1 = find(e.u);
            int s2 = find(e.v);
            if (s1 != s2) {
                ans += e.w;
                union(s1, s2);
                k--;
            }
            if (k == 0) break;
        }
    }

    private static void union(int a, int b) {
        int x = find(a);
        int y = find(b);

        if (x != y) {
            father[x] = y;
        }
    }

    private static int find(int x) {
        return x == father[x] ? x : (father[x] = find(father[x]));
    }

    static class Edge {
        int u, v, w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
}
