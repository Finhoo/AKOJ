package contest3;

import java.util.*;

/**
 * Created by fan on 2017/7/16.
 */

/**
 * Created by fan on 2017/7/16.
 */

public class A {
    static int du[], n, m, L[];
    static Vector<Integer> g[];
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            n = cin.nextInt(); m = cin.nextInt();
            g = new Vector[n+1];
            for (int i = 0; i <= n; i++) {
                g[i] = new Vector<>();
            }
            for (int i = 0; i < m; i++) {
                int x = cin.nextInt();
                int y = cin.nextInt();
                g[x].addElement(y);
            }
            if (toposort()) {
                for (int i = 0; i < n-1; i++) {
                    System.out.print(L[i] + " ");
                }
                System.out.println(L[n-1]);
            }else {
                System.out.println("-1");
            }
        }
        cin.close();
    }

    private static boolean toposort() {
        du = new int[n+1];
        L = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < g[i].size(); j++) {
                du[g[i].get(j)]++;
            }
        }
        int tot = 0;
        TreeSet<Integer> Q = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (f(o1) != f(o2)) {
                    return f(o2) - f(o1);
                }
                return o1-o2;
            }

            private int f(int n) {
                int s = 0;
                while (n != 0) {
                    s += n % 10;
                    n /= 10;
                }
                return s;
            }
        });

        for (int i = 1; i <= n; i++) {
            if (du[i] == 0)
                Q.add(i);
        }

        while (!Q.isEmpty()) {
            int x = Q.pollFirst();
            L[tot++] = x;
            for (int i = 0; i < g[x].size(); i++) {
                int t = g[x].get(i);
                du[t]--;
                if (du[t] == 0) {
                    Q.add(t);
                }
            }
        }

        if (tot == n)
            return true;
        return false;
    }
    static class Node{
        int num;
        int x;
        int y;

        public Node(int num, int x, int y) {
            this.num = num;
            this.x = x;
            this.y = y;
        }
    }
}
