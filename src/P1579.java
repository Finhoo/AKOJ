import java.util.Scanner;

public class P1579 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			solve(n);
		}
		cin.close();
	}

	private static void solve(int n) {
		if (n == 0) {
			System.out.println(0+" "+0);
			return;
		}
		double mid = Math.sqrt(n);
		int p = (int)mid, q = p;
		while (p >= 1 && q <= n) {
			if (n % q == 0) {
				System.out.println(p+" "+n / p);
				break;
			}
			if (p == 1 && q < n){
				q++;
			}else if (p > 1 && q == n) {
				p--;
			}else {
				p--;
				q++;
			}
		}
	}
}
