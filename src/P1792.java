
import java.util.Scanner;

public class P1792 {
	private static boolean isDifferent(int a[]) {
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (i != j && a[i] == a[j])
					return false;
			}
		}
		return true;
	}

	public static String Cn(int N, int X[][], int K) {
		String flag = "";
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (X[i][j] == 0) {
					flag = flag + i + " " + j;
					if (i != N - 1 || j != N - 1)
						flag = flag + "*";
				}
			}
		}
		String flags[] = flag.split("\\*");

		int a[] = new int[N + 1];
		a[0] = 0;
		for (int i = 1; i <= N; i++)
			a[i] = i - 1;
		int x = 0;
		while (a[0] == 0) {
			String cache = "";
			for (int i = 1; i < a.length; i++) {
				if (isDifferent(a)) {
					cache += a[i];
					if (i != a.length - 1)
						cache += " ";
				}
			}
			boolean fl = true;
			for (String f : flags) {
				if (cache.indexOf(f) != -1) {
					fl = false;
					break;
				}
			}
			if (cache != "" && fl) {
				x++;
				if (x == K)
					return cache;
			}

			a[N]++; 
			for (int i = N; i >= 0; i--) {
				if (a[i] >= N) {
					if (i != 0)
						a[i - 1] += a[i] / N;
					a[i] %= N;
				}
			}
		}
		return "error";
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int N = cin.nextInt(), K = cin.nextInt();
			int a[][] = new int[N][N];
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					a[i][j] = cin.nextInt();
			System.out.println(Cn(N, a, K));
		}
		cin.close();
	}
}