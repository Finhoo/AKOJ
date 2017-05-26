
import java.util.Scanner;

public class P1068 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++)
				a[i] = i+1;
			perm(a, 0, n);
		}
		cin.close();
	}

	private static void perm(int[] a, int cur, int n) {
		if (cur == n-1)
			print(a);
		else {
			for (int i = cur; i<n; i++) {
				swap(a, i, cur);
				perm(a, cur+1, n);
				swap(a, i, cur);
			}
		}
	}

	private static void swap(int[] a, int i, int cur) {
		int t = a[i];
		a[i] = a[cur];
		a[cur] = t;
	}

	private static void print(int[] a) {
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
}
