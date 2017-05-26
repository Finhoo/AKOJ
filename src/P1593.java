import java.util.Scanner;

public class P1593 {
	static int n, k, a[], ans;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			n = cin.nextInt();
			k = cin.nextInt();
			a = new int[n];
			for (int i=0; i<n; i++)
				a[i] = cin.nextInt();
			ans = 0;
			dfs(0, 0, 0);
			System.out.println(ans);
		}
		cin.close();
	}

	private static void dfs(int cur, int cnt, int sum) {
		if (cnt == k) {
			if (isPrime(sum)) {
				ans++;
				return;
			}
		}else {
			for (int i=cur; i<n; i++) {
				dfs(i + 1, cnt + 1, sum + a[i]);
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n % 2 == 0 && n  != 2 || n < 2)
			return false;
		for (int i=3; i*i<=n; i+=2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}