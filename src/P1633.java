import java.util.Scanner;

public class P1633 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
			System.out.println(lcm(lcm(a, b), c));
		}
		cin.close();
	}

	private static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
