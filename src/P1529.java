import java.util.Scanner;

public class P1529 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next();
			int k = cin.nextInt();
			solve(s, k);
		}
		cin.close();
	}

	private static void solve(String s, int k) {
		char a[] = s.toCharArray();
		for (int i=0; i<a.length && k > 0; i++) {
			char max = a[i];int index = i;
			for (int j=i+1; j<=i+k && j<a.length; j++) {
				if (max < a[j]) {
					max = a[j];
					index = j;
				}
			}
			for (int j=index; j>i; j--) {
				a[j] = a[j-1];
				k--;
			}
			a[i] = max;
		}
		System.out.println(a);
	}
}
