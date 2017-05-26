import java.util.Scanner;

public class P1283new {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int ret = 1;
			for (int i = 1; i <= n; i++)
				ret = (ret * remove25(i)) % 10;
			int t = mylog(2, n) - mylog(5, n);
			while (t-- > 0) {
				ret = (ret * 2) % 10;
			}
			System.out.println(ret);
		}
		cin.close();
	}

	private static int mylog(int p, int n) {
		int t = p;
		int s = 0;
		while (t <= n) {
			s += n / t;
			t *= p;
		}
		return s;
	}

	private static int remove25(int n) {
		while (n % 2 == 0)
			n /= 2;
		while (n % 5 == 0)
			n /= 5;
		return n;
	}
}
