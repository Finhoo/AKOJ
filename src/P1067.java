
import java.util.Scanner;

public class P1067 {
	static int n, m, sx, sy;
	static int dx[] = {0, 1, 0, -1, 0};
	static int dy[] = {0, 0, -1, 0, 1}; 
	static int map[][], max;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt(); m = cin.nextInt();
			sx = cin.nextInt(); sy = cin.nextInt();
			char a[][] = new char[n][m];
			map= new int[n][m];
			for (int i=0; i<n; i++)
				for (int j=0; j<m; j++)
					map[i][j] = 0;
			cin.nextLine();
			for (int i=0; i<n; i++) {
				a[i] = cin.nextLine().toCharArray();
			}
			max = 0;
			dfs(a, sx, sy);
			System.out.println(max);
		}
		cin.close();
	}

	private static void dfs(char[][] a, int x, int y) {
		if (x >=0 && x < n && y >= 0 && y < m) {
			int ans = f(a, x, y);
			if (ans > max)
				max = ans;
			for (int i=0; i<5; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0 && a[nx][ny] == '.') {
					map[nx][ny] = 1;
					dfs(a, nx, ny);
				}
			}
		}
	}

	private static int f(char[][] a, int x, int y) {
		int sum = 0;
		if (x >= 0 && x < n && y > 0 && y < m) {
			int i = x, j = y;
			while (i > 0 && a[i][j] != '#') {
				if (a[i][j] == 'G')
					sum++;
				i--;
			}
			i = x; j = y;
			while (j > 0 && a[i][j] != '#') {
				if (a[i][j] == 'G')
					sum++;
				j--;
			}
			i = x; j = y;
			while (i < n && a[i][j] != '#') {
				if (a[i][j] == 'G')
					sum++;
				i++;
			}
			i = x; j = y;
			while (j < m && a[i][j] != '#') {
				if (a[i][j] == 'G')
					sum++;
				j++;
			}
		}
		return sum;
	}
}
