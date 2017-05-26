import java.util.Arrays;
import java.util.Scanner;

public class P1335 {
	static int a[] = new int [1001];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		a[1] = 1;
		Arrays.fill(a, 0);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(set(n));
		}
		cin.close();
	}

	private static int set(int n) {
		if (a[n] > 0)
			return a[n];
		int sum = 1;
		for (int i = 1; i <= n / 2; i++) {
			sum += set(i);
		}
		a[n] = sum;
		return sum;
	}
}
