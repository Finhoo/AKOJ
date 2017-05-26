import java.util.Scanner;

public class P1682 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a = 0, b = 0;
			while (n-- > 0) {
				a += cin.nextInt();
				b += cin.nextInt();
			}
			System.out.println(a+"+"+b+"i");
		}
		cin.close();
	}
}
