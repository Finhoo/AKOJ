import java.util.Scanner;

public class P1591 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int num[] = new int[n];
			int d[] = new int[n];
			for (int i=0; i<n; i++) {
				num[i] = cin.nextInt();
				d[i] = 1;
			}
			for (int i=1; i<n; i++) {
				for (int j=0; j<i; j++) {
					if (num[j] > num[i]) {
						
					}
				}
			}
		}
		cin.close();
	}
}
