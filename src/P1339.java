
import java.util.Scanner;

public class P1339 {
	static int[][] a;
	static int n, m;
	static int dx[] = { -2, -1, 1, 2, -2, -1, 2, 1 };
	static int dy[] = { -1, -2, -2, -1, 1, 2, 1, 2 };

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		n = cin.nextInt();
		m = cin.nextInt();
		a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				a[i][j] = 0;
		}
		a[0][0] = 1;
		GoOver(0, 0, 1);
		cin.close();
	}

	private static void GoOver(int x, int y, int k) {
		if (k == n * m && back(x, y)) {
			print(n, m);
			return;
		}
		for (int i = 0; i < 8; i++) {
			int xx = dx[i] + x, yy = dy[i] + y;
			if (ok(xx, yy)) {
				a[xx][yy] = k + 1;
				GoOver(xx, yy, k + 1);
				a[xx][yy] = 0;
			}
		}
	}

	private static boolean ok(int xx, int yy) {
		if (xx < 0 || yy < 0 || xx >= n || yy >= m || a[xx][yy] != 0)
			return false;
		return true;
	}

	private static void print(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	private static boolean back(int x, int y) {
		for (int i = 0; i < 8; i++) {
			if (x + dx[i] == 0 && y + dy[i] == 0)
				return true;
		}
		return false;
	}
}
