import java.util.Arrays;
import java.util.Scanner;

public class P1705 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = cin.nextInt();
			for (int i = 0; i < n; i++)
				b[i] = cin.nextInt();
			Arrays.sort(a);
			Arrays.sort(b);
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += a[i] * b[n - i - 1];
			}
			System.out.println(sum);

		}
		cin.close();
	}
}
