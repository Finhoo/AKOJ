
import java.util.Arrays;
import java.util.Scanner;

public class P1110 {
	static int index;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				index = 0;
				int a[] = new int[4];
				for (int i=0; i<4; i++)
					a[i] = cin.nextInt();
				Arrays.sort(a);
				solve(a);
				System.out.println();
			}
		}
		cin.close();
	}

	private static void solve(int[] a) {
		perm(a, 0);
	}

	private static void perm(int[] a, int cur) {
		if (cur == a.length - 1) {
			index++;
			if (index % 6 > 1 || index % 6 == 0)
				System.out.print(" ");
			for (int i=0; i<a.length; i++)
				System.out.print(a[i]);
			if (index % 6 == 0)
				System.out.println();
		} else {
			for (int i=cur; i<a.length; i++) {
				chang(a, i, cur);
				perm(a, cur+1);
				rechang(a, i, cur);
			}
		}
	}

	private static void rechang(int[] a, int i, int cur) {
		int t = a[cur];
		for (int j=cur+1; j<=i; j++)
			a[j-1] = a[j];
		a[i] = t;
	}

	private static void chang(int[] a, int i, int cur) {
		int t = a[i];
		for (int j=i; j>0; j--)
			a[j] = a[j-1];
		a[cur] = t;
	}

	private static void swap(int[] a, int i, int cur) {
		int t = a[i];
		a[i] = a[cur];
		a[cur] = t;
	}
}
