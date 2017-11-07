package contest1118;

import java.util.Scanner;

/**
 * Created by fan on 2017/10/9.
 */
public class P1585 {
    static char [][]map;
    static int n, m;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            m = cin.nextInt();
            map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = cin.next().toCharArray();
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == '.') {
                        int num = f(i, j);
                        max = max < num ? num : max;
                    }
                }
            }
            System.out.println(max);
        }
        cin.close();
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
