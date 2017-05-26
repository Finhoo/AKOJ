import java.util.Scanner;

public class P1332 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt();
			System.out.println(String.format("%03d", pow(a, b)));
		}
		cin.close();
	}

	private static int pow(int a, int b) {
		if (b == 0 || a == 1) return 1;
		if (a == 0) return 0;
		if (b % 2 == 0) return pow(a * a % 1000, b/2) % 1000;
		else return pow(a*a%1000, b/2) *a % 1000;
	}
}
