import java.util.Arrays;
import java.util.Scanner;

public class P1807 {
	final static int INF = 65536;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			int min = Integer.MAX_VALUE;
			for (int i=0; i<n; i++) {
				a[i] = cin.nextInt();
				if (a[i] < min)
					min = a[i];
			}
			int tmp = a[0];
			for (int i=1; i<n; i++)
				tmp = gcd(tmp, a[i]);
			int f[] = new int[100001];
			Arrays.fill(f, 0);
			f[0] = 1;
			if (tmp == 1) {
				for (int i=0; i<n; i++) {
					for (int j=a[i]; j<=INF; j++) {
						f[j] |= f[j-a[i]];
					}
				}
				for (int i=INF; i>=0; i--){
					if (f[i] == 0) {
						System.out.println(i);
						return;
					}
				}
			}
			System.out.println(0);
			return;
			
		}
		cin.close();
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
