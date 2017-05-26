import java.util.Arrays;
import java.util.Scanner;

public class P1523 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a =cin.nextInt(), b = cin.nextInt();
			int x[] = new int[8];
			int y[] = new int[8];
			Arrays.fill(x, 0);
			Arrays.fill(y, 0);
			for (int i=7; i>=0; i--) {
				x[i] = a % 2; y[i] = b % 2;
				a /= 2; b /= 2;
			}

			for (int i=0; i<8; i++) {
				for (int j=0; j<8; j++) {
					if (x[j] == y[i] && x[j] == 1)
						System.out.print("+");
					else
						System.out.print("-");
				}System.out.println();
			}
		}
		cin.close();
	}
}
