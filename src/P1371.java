
import java.math.BigInteger;
import java.util.Scanner;

public class P1371 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String s = cin.next();
			int k = cin.nextInt();
			f(s, k);
		}
		cin.close();
	}

	private static void f(String s, int k) {
		while (k-- > 0)
			s = dd(s);
		System.out.println(s);
	}

	private static String dd(String s) {
		char a[] = s.toCharArray();
		BigInteger bigSum = new BigInteger("0");
		BigInteger min = new BigInteger(s);
		BigInteger ten = new BigInteger("10");
		for (int i=0; i<a.length; i++) {
			bigSum = new BigInteger("0");
			for (int j=0; j<a.length; j++) {
				if (i != j) {
					BigInteger data = new BigInteger(String.valueOf(a[j]));
					bigSum = bigSum.multiply(ten).add(data);
				}
			}
			if (bigSum.compareTo(min) < 0) {
				min = bigSum;
			}
		}
		return min.toString();
	}
}