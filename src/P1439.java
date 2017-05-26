import java.util.Scanner;

public class P1439 {
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())  {
			int a = cin.nextInt(), b = cin.nextInt(), n = cin.nextInt();
			solve(a, b, n);
		}
		cin.close();
	}

	private static void solve(int a, int b, int n) {
		int [] fib = new int[n+10];
		fib[0] = a % MOD;
		fib[1] = b % MOD;
		for (int i=2; i<=n; i++)
			fib[i] = (fib[i-1] % MOD +fib[i-2] % MOD) % MOD;
		System.out.println(fib[n]);
	}
}
