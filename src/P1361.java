import java.util.Scanner;

public class P1361 {
	static int[][] a, b;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			a = new int[n][n];
			b = new int[n][n];
			for (int i=0; i<n; i++) {
				for (int j=0; j<=i; j++) {
					a[i][j] = cin.nextInt();
				}
			}
			for (int i=1; i<n; i++) {
				for (int j=0; j<=i; j++) {
					
				}
			}
		}
		cin.close();
	}
}
