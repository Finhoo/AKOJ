import java.util.Scanner;

public class P1211 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t  = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			toBit(n);
		}
		cin.close();
	}

	private static void toBit(int n) {
		String bit = Integer.toBinaryString(n);
		String zeros = f(32 - bit.length());
		System.out.println(zeros+bit);
	}

	private static String f(int n) {
		String s = "";
		while (n-- > 0)
			s += "0";
		return s;
	}
}
