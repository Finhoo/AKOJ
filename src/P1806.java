import java.util.Scanner;

public class P1806 {
	static int max, n, m, max2;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt(); m = cin.nextInt();
			int a[][] = new int[n][m];
			for (int i=0; i<n; i++)
				for (int j=0; j<m; j++)
					a[i][j] = cin.nextInt();
			max = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					for (int k=max; k<n; k++) {
						if (judge(a, i, j, k, 0) || judge(a, i, j, k,1))
							max = k;
					}
				}
			}
			
			System.out.println(max * max);
		}
		cin.close();
	}
	private static boolean judge(int[][] a, int x, int y, int k, int tag) {
		Boolean result = true;
		for (int i=0; i<k; i++)
			for (int j=0; j<k; j++)
				if (i + x >= n || j + y >= m || a[i+x][j+y] == tag) {
					result = false;
					break;
				}
		return result;
	}
}
