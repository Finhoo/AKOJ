import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1590 {
	static class point {
		int x, y;
		int step;

		public point(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), m = cin.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			int sx = cin.nextInt(), sy = cin.nextInt();
			int ex = cin.nextInt(), ey = cin.nextInt();
			int ans = bfs(a, sx-1, sy-1, ex-1, ey-1, n, m);
			if (ans != -1)
				System.out.println(ans);
			else System.out.println("No Way!");
		}
		cin.close();
	}

	private static int bfs(int[][] a, int sx, int sy, int ex, int ey, int n, int m) {
		Queue<point> queue = new LinkedList<>();
		int step = 0;
		queue.add(new point(sx, sy, step));
		if (sx == ex && sy == ey)
			return step;
		while (!queue.isEmpty()) {
			point P = queue.remove();
			for (int i = 0; i < 4; i++) {
				int nx = P.x + dx[i];
				int ny = P.y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && a[nx][ny] == 0) {
					queue.add(new point(nx, ny, P.step + 1));
					a[nx][ny] = -1;
					if (nx == ex && ny == ey) {
						return P.step + 1;
					}
				}
			}
		}
		return -1;
	}
}
