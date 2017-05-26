import java.util.Scanner;

public class P1568 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(solve(n));
		}
		cin.close();
	}
	private static int solve(int n) {
		if (n < 2) return 1;
		if (n == 2) return 3;
		int t =2;
		int p = 1, q = 1, s = 2;
		while (s < n) {
			s = p  + q;
			p = q;
			q = s;
			t++;
		}
		return t;
	}
}
