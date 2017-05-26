import java.math.BigDecimal;
import java.util.Scanner;

public class P1548 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String a = cin.next(), b = cin.next();
			int c = cin.nextInt();
			System.out.println(new BigDecimal(a).add(new BigDecimal(b)).setScale(c, BigDecimal.ROUND_HALF_UP));
		}
		cin.close();
	}
}
