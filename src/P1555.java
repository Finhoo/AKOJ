import java.util.Scanner;

public class P1555 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long s = 1;
			long n = cin.nextLong();
			for (long i=n; i>=1; i-=2) {
				s *= i;
			}
			System.out.println(s);
		}
		cin.close();
	}
}
