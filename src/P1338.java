import java.util.Scanner;

public class P1338 {
	static int total = 0;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			total = 0;
			solve(n);
			System.out.println(total);
		}
		cin.close();
	}
	private static void solve(int n) {
		if (n == 1) total++;
		else {
			for (int i=2; i<=n; i++) {
				if (n % i == 0)
					solve(n / i);
			}
		}
	}


}
