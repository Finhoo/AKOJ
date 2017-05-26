
import java.util.Scanner;

public class guan1134 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();
		int n = 10000;
		a = a + n / 365;
		b = b + n % 365 / 30;
		c = c + n % 365 % 30;
		while (b > 12 || c > 28) {
			a = a + b / 12;
			b = b % 12;
			if (a % 4 != 0 || a % 100 == 0 && a % 400 != 0 && (b == 2 && c > 28)) {
				b = b + c / 28;
				c = c % 28;
			}
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0 && (b == 2 && c > 29)) {
				b = b + c / 29;
				c = c % 29;
			}
			if ((b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && c > 31) {
				b = b + c / 31;
				c = c % 31;
			}
			if ((b == 4 || b == 6 || b == 9 || b == 11) && c > 30) {
				b = b + c / 30;
				c = c % 30;
			}
		}
		System.out.println(a + "-" + b + "-" + c);
		cin.close();
	}

}
