import java.math.BigInteger;
import java.util.Scanner;

public class P1547 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()) {
			String a = cin.next(), b=cin.next();
			System.out.println(new BigInteger(a).add(new BigInteger(b)));
		}
		cin.close();
	}
}
