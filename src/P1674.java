import java.util.Arrays;
import java.util.Scanner;

public class P1674 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n; i++)
				a[i] = cin.nextInt();
			Arrays.sort(a);
			for (int i=n-1; i>n-10-1; i--) {
				System.out.print(a[i]+" ");
			}System.out.println();
		}
		cin.close();
	}
}
