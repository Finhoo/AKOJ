import java.util.Scanner;

public class P1587 {
	static int n, m, a[][], sum, map[][];
	static int dx[] = {0, 1, 0, -1, 0};
	static int dy[] = {0, 0, 1, 0, -1};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt(); m = cin.nextInt();
			int sx = cin.nextInt(), sy =  cin.nextInt();
			a = new int[n][m];
			map = new int[n][m];
			fill(map);
			for (int i=0; i<n; i++)
				for (int j=0; j<m; j++)
					a[i][j] = cin.nextInt();
			sum = 0;
			dfs(sx-1, sy-1);
			System.out.println(sum);
		}
		cin.close();
	}
	private static void fill(int[][] map) {
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++)
				map[i][j] = 0;
		}
	}
	private static void dfs(int x, int y) {
		if (x >=0 && x < n && y >= 0 && y < m) {
			for (int i=0; i<5; i++) {
				int nx = x + dx[i], ny = y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0 && a[nx][ny] > 0) {
					map[nx][ny] = 1;
					sum++;
					dfs(nx, ny);
				}
			}
		}
	}
}
