import java.util.Scanner;

public class P1641 {
	public static void main(String args[]) {
		int L = 0, R = 0;
		Scanner cin= new Scanner(System.in);
		int n = cin.nextInt();
		int k[] = new int[n + 1];
		for (int i = 1; i <= n; i++)
			k[i] = cin.nextInt();
		for (int i = 2; i <= n; i++) {
			if (k[1] > 0) {
				if (Math.abs(k[1]) < Math.abs(k[i]) && k[i] < 0)
					R++;
				if (Math.abs(k[1]) > Math.abs(k[i]) && k[i] > 0)
					L++;
			} else {
				if (Math.abs(k[1]) < Math.abs(k[i]) && k[i] < 0)
					R++;
				if (Math.abs(k[1]) > Math.abs(k[i]) && k[i] > 0)
					L++;
			}
		}
		if (L != 0 || R != 0) {
			System.out.println(R + L + 1);
		}
		cin.close();
	}
}